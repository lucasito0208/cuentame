package es.alten.cuentame.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.alten.cuentame.dto.filters.UserFilterDTO;

public class UserFilDTOTest {

  UserFilterDTO userFilterDTO;

  @BeforeEach
  void setUp() throws Exception {
    userFilterDTO = new UserFilterDTO();
  }

  @Test
  void testObtainFilterSpecification() {
    userFilterDTO.obtainFilterSpecification();
    userFilterDTO.setEmail("test1");
    Assertions.assertEquals("test1", userFilterDTO.getEmail());
  }

}
