package es.alten.cuentame.dto.filters;

import es.alten.cuentame.domain.User;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;

/** DTO to store user filtering information. */
@SuppressWarnings({"UnusedDeclaration"})
@ApiModel(value = "UserFilterDTO", description = "User filter")
@EqualsAndHashCode(callSuper = true)
@Data
public class UserFilterDTO extends BaseFilterDTO<User> {

  /** serialVersionUID for object serialization. */
  private static final long serialVersionUID = -7726776743129637984L;

  /** User email. */
  private String email;

  @Override
  public Specification<User> obtainFilterSpecification() {
    return (root, query, cb) -> {
      // Not deleted users
      Predicate predicate = cb.and();
      // User email filter
      if (StringUtils.isNotBlank(this.email)) {
        predicate =
            cb.and(predicate, cb.like(root.get("email"), "%" + this.email.toLowerCase() + "%"));
      }

      return predicate;
    };
  }
}
