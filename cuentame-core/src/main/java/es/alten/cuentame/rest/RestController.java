package es.alten.cuentame.rest;

import es.alten.cuentame.bo.GenericCRUDService;
import es.alten.cuentame.domain.ElvisEntity;
import es.alten.cuentame.dto.ElvisBaseDTO;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Generic interface for REST Controllers.
 *
 * @param <D> type of DTO
 * @param <I> type of identification of entity
 * @noinspection unused
 */
public interface RestController<
    E extends ElvisEntity,
    D extends ElvisBaseDTO,
    I extends Serializable,
    B extends GenericCRUDService> {

  void init();

  ResponseEntity<List<D>> findAll();

  ResponseEntity<D> findOne(I id) throws IllegalAccessException, InstantiationException;

  ResponseEntity<D> add(D item);

  ResponseEntity<D> update(D input);

  ResponseEntity<Void> delete(I id);

  ResponseEntity<Void> deleteAll();
}
