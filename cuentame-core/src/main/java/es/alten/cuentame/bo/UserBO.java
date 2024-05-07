package es.alten.cuentame.bo;

import es.alten.cuentame.domain.QUser;
import es.alten.cuentame.domain.User;
import es.alten.cuentame.dto.UserFilterDTO;

/** Define services to work with Users. */
public interface UserBO extends GenericCRUDService<User, Long, QUser, UserFilterDTO> {
  User findByEmail(String email);
}
