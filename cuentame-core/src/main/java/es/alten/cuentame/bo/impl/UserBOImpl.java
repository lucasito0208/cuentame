package es.alten.cuentame.bo.impl;

import es.alten.cuentame.bo.UserBO;
import es.alten.cuentame.dao.UserRepository;
import es.alten.cuentame.domain.QUser;
import es.alten.cuentame.domain.User;
import es.alten.cuentame.dto.filters.UserFilterDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implements interface {@link UserBO}.
 *
 * @noinspection unused
 */
@Service
@Transactional
public class UserBOImpl
    extends ElvisGenericCRUDServiceImpl<User, Long, QUser, UserFilterDTO, UserRepository>
    implements UserBO {

  private static final long serialVersionUID = -4166529873832767435L;
  private static final Logger LOG = LoggerFactory.getLogger(UserBOImpl.class);

  @Override
  public User findByEmail(String email) {
    LOG.debug("findByEmail");
    return this.repository.findByEmail(email);
  }
}
