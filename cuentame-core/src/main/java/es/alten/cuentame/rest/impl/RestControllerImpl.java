package es.alten.cuentame.rest.impl;

import es.alten.cuentame.bo.GenericCRUDService;
import es.alten.cuentame.domain.ElvisEntity;
import es.alten.cuentame.dto.ElvisBaseDTO;
import es.alten.cuentame.rest.RestController;
import es.alten.cuentame.utils.ListMapper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public abstract class RestControllerImpl<
        T extends ElvisEntity,
        D extends ElvisBaseDTO,
        I extends Serializable,
        B extends GenericCRUDService>
    extends BaseControllerImpl implements RestController<T, D, I, B> {

  /** serialVersionUID for object serialization. */
  private static final long serialVersionUID = -3773361112339871851L;

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(RestControllerImpl.class);

  /* DTO object to show / edit in detail. */

  /** DTO object class to instantiate generic type. */
  private Class<D> dtoType;
  /* Entity class to instantiate generic type. */

  /**
   * Business object to delegate control operations logic.
   *
   * @noinspection SpringJavaAutowiredMembersInspection
   */
  @Autowired protected B bo;

  @Override
  @PostConstruct
  @SuppressWarnings("all")
  public void init() {
    LOG.debug("init");
    final ParameterizedType genericSuperclass =
        (ParameterizedType) getClass().getGenericSuperclass();
    dtoType =
        (Class<D>)
            genericSuperclass
                .getActualTypeArguments()[genericSuperclass.getActualTypeArguments().length - 3];
  }

  @Override
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  @SuppressWarnings("unchecked")
  @ApiOperation(
      value = "Get all elements",
      notes = "Get all elements",
      responseContainer = "List",
      httpMethod = "GET")
  public ResponseEntity<List<D>> findAll() {
    final List<T> result = bo.findAll();
    List<D> resultado = new ArrayList<>();
    try {
      resultado = ListMapper.map(result, dtoType);
    } catch (IllegalAccessException
        | InstantiationException
        | NoSuchMethodException
        | InvocationTargetException e) {
      LOG.error(e.getLocalizedMessage(), e);
    }
    if (result.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }

  // -------------------Retrieve single item ------------------------------------------
  @Override
  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  @SuppressWarnings("unchecked")
  @ApiOperation(
      value = "Get element by identification",
      notes = "Get element by identification",
      httpMethod = "GET")
  public ResponseEntity<D> findOne(@PathVariable("id") final I id)
      throws IllegalAccessException, InstantiationException {
    LOG.info("Fetching result with id {}", id);
    final D dto;
    final T domain = (T) bo.findOne(id);
    if (domain == null) {
      LOG.error("Result with id {} not found.", id);
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    } else {
      try {
        dto = dtoType.getDeclaredConstructor().newInstance();
        dto.loadFromDomain(domain);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
      } catch (final NoSuchMethodException | InvocationTargetException exception) {
        LOG.error(String.format("Unable to instantiate an object of type %s", dtoType.getName()));
      }
    }
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
  }

  // ------------------- Create item --------------------------------------------------------
  @Override
  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "Create a new element", notes = "Create a new element", httpMethod = "POST")
  public ResponseEntity<D> add(@RequestBody final D item) {
    bo.save(item.obtainDomainObject());
    return ResponseEntity.status(HttpStatus.CREATED).body(null);
  }
  // ------------------- Update item --------------------------------------------------------

  @Override
  @SuppressWarnings("unchecked")
  @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "Update an element", notes = "Update an element", httpMethod = "PATCH")
  public ResponseEntity<D> update(@RequestBody final D input) {
    final T itemToUpdate = (T) bo.findOne(input.getId());
    if (itemToUpdate != null) {
      bo.save(input.obtainDomainObject());
      return new ResponseEntity<>(HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  // ------------------- Delete item --------------------------------------------------------

  @Override
  @DeleteMapping(value = "/{id}")
  @SuppressWarnings("unchecked")
  @ApiOperation(value = "Delete an element", notes = "Delete an element", httpMethod = "DELETE")
  public ResponseEntity<Void> delete(@PathVariable("id") final I id) {
    LOG.info("Fetching & Deleting item with id {}", id);
    final T item = (T) bo.findOne(id);
    if (item == null) {
      LOG.info("Unable to delete. Item with id {} not found", id);
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    bo.delete(item);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  // ------------------- Delete all items  --------------------------------------------------------

  @Override
  @DeleteMapping
  @ApiOperation(value = "Delete all elements", notes = "Delete all elements", httpMethod = "DELETE")
  public ResponseEntity<Void> deleteAll() {
    LOG.info("Deleting All items");
    bo.deleteAll();
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
