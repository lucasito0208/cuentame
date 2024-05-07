package es.alten.cuentame.dto;

import es.alten.cuentame.domain.ElvisEntity;
import es.alten.cuentame.utils.ObjectMapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mapping.MappingException;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/** Basic DTO with general needed operations. */
@SuppressWarnings("unused")
@ApiModel(value = "ElvisBaseDTO", description = "Elvis Base")
@Data
public abstract class ElvisBaseDTO<T extends ElvisEntity> implements Serializable {

  /** serialVersionUID for object serialization. */
  private static final long serialVersionUID = 3212686467056680847L;

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ElvisBaseDTO.class);

  /** Object mapper to transform Entity to DTO and vice versa. */
  private final ObjectMapper mapper;
  /** Entity type. */
  private final Class<T> entityType;
  /** Entity identifier. */
  @ApiModelProperty(value = "Object identification", dataType = "java.lang.Long", example = "2")
  private Long id;

  /**
   * Default constructor.
   *
   * @noinspection all
   */
  public ElvisBaseDTO() {
    // Gets form type used by child controller
    final ParameterizedType genericSuperclass =
        (ParameterizedType) getClass().getGenericSuperclass();

    entityType =
        (Class<T>)
            genericSuperclass
                .getActualTypeArguments()[genericSuperclass.getActualTypeArguments().length - 1];

    // Initializes the object mapper
    mapper = ObjectMapper.getInstance();
  }

  /**
   * Load DTO object with domain data.
   *
   * <p>If any kind of non-regular mapping it's needed (when origin field and destiny field don't
   * have the same name): 1- override this method at the DTO, 2- call super.loadFromDomain(entity),
   * 3- add the specific mappings.
   *
   * @param entity Domain data to load to DTO.
   */
  public void loadFromDomain(final T entity) {
    try {
      mapper.map(entity, this);
    } catch (final MappingException e) {
      LOG.error(
          String.format(
              "BaseDTO : loadFromDomain, Mapping exception with type %s", entityType.getName()));
    }
  }

  /**
   * Obtain domain object with DTO data.
   *
   * <p>If any kind of non-regular mapping it's needed (when origin field and destiny field don't
   * have the same name): 1- override this method at the DTO, 2- call super.obtainDomainObject(), 3-
   * add the specific mappings.
   *
   * @return entity Domain object with DTO data loaded.
   */
  public T obtainDomainObject() {
    T entity = null;

    try {

      entity = entityType.getDeclaredConstructor().newInstance();
      mapper.map(this, entity);
    } catch (final MappingException e) {
      LOG.error(
          String.format(
              "BaseDTO : obtainDomainObject, Mapping exception with type %s",
              entityType.getName()));
    } catch (final InstantiationException | IllegalAccessException e) {
      LOG.error(
          String.format(
              "BaseDTO : obtainDomainObject, Unable to instantiate an object of type %s",
              entityType.getName()));
    } catch (final Exception e) {
      LOG.error(
          String.format(
              "Exception in BaseDTO : obtainDomainObject, Unable to instantiate an object of type %s",
              entityType.getName()));
    }

    return entity;
  }
}
