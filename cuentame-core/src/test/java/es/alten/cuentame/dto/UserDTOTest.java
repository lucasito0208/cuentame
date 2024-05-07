package es.alten.cuentame.dto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class UserDTOTest {

  UserDTO userDTO = new UserDTO();

  @BeforeEach
  void setUp() throws Exception {
    userDTO = new UserDTO() {};
  }

  @Test
  void testEquals() {
    userDTO.equals(null);
    Assertions.assertNotEquals(null, userDTO);
  }

  @Test
  void testHashCode() {
    UserDTO x = new UserDTO();
    x.setEmail("Foo Bar");
    UserDTO y = new UserDTO();
    y.setEmail("Foo Bar");
    Assertions.assertTrue(x.equals(y) && y.equals(x));
    Assertions.assertTrue(x.hashCode() == y.hashCode());
  }
}
