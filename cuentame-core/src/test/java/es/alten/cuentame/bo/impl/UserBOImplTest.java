package es.alten.cuentame.bo.impl;

import es.alten.cuentame.bo.UserBO;
import es.alten.cuentame.dao.UserRepository;
import es.alten.cuentame.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class UserBOImplTest {

  private static final String EMAIL_PRUEBA = "emailPrueba";

  @InjectMocks UserBO userBO = new UserBOImpl();

  @Mock UserRepository repository;

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void testFindByEmail() {
    User mock_user = new User();
    mock_user.setId(Long.valueOf(1));
    mock_user.setEmail(EMAIL_PRUEBA);
    when(repository.findByEmail(anyString())).thenReturn(mock_user);
    User userBBDD = userBO.findByEmail(EMAIL_PRUEBA);

    verify(repository, times(1)).findByEmail(EMAIL_PRUEBA);

    Assertions.assertNotNull(userBBDD);
    Assertions.assertEquals(userBBDD.getId(), Long.valueOf(1));
    Assertions.assertEquals(EMAIL_PRUEBA, userBBDD.getEmail());
  }
}
