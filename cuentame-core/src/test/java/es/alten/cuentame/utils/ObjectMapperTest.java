package es.alten.cuentame.utils;

import es.alten.cuentame.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.mapping.MappingException;

class ObjectMapperTest {

  ObjectMapper mapper;

  @BeforeEach
  void setUp() throws Exception {
    mapper = ObjectMapper.getInstance();
  }

  @Test
  void test() throws MappingException {
    User user = new User();
    user.setCreatedBy(Constants.ANONYMOUS_USER);
    user.setId(Long.valueOf(10));
    Assertions.assertThrows(
        MappingException.class, () -> mapper.map(user, null), "MappingException");
  }
}
