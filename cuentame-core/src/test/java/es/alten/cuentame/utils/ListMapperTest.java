package es.alten.cuentame.utils;

import es.alten.cuentame.domain.ElvisEntity;
import es.alten.cuentame.domain.User;
import es.alten.cuentame.dto.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ListMapperTest {

  ListMapper listMapper = new ListMapper();

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void test() {
    List<UserDTO> listUser = new ArrayList<>();
    UserDTO userDTO = new UserDTO();
    userDTO.setEmail("");
    userDTO.setCreateDate(new Date());
    userDTO.setCreatedBy(Constants.ANONYMOUS_USER);
    userDTO.setId(Long.valueOf(10));
    userDTO.setUpdateDate(new Date());
    userDTO.setUpdatedBy(Constants.ANONYMOUS_USER);
    listUser.add(userDTO);
    List<ElvisEntity> listElvisEntity = ListMapper.map(listUser);

    Assertions.assertNotNull(listElvisEntity);
  }

  @Test
  void test1()
      throws IllegalAccessException, InstantiationException, NoSuchMethodException,
          InvocationTargetException {
    List<User> listUser = new ArrayList<>();
    User user = new User();
    user.setCreatedBy(Constants.ANONYMOUS_USER);
    user.setId(Long.valueOf(10));
    listUser.add(user);
    List<UserDTO> listElvisEntity = ListMapper.map(listUser, UserDTO.class);

    Assertions.assertNotNull(listElvisEntity);
  }
}
