package es.alten.cuentame.exceptions;

import es.alten.cuentame.utils.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BadInputExceptionTest {

  BadInputException badInputException;

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void testBadInputException() {
    badInputException = new BadInputException();
    Assertions.assertEquals(badInputException.getClass(), BadInputException.class);
  }

  @Test
  void testBadInputExceptionString() {
    badInputException = new BadInputException(Constants.ERROR);
    assertEquals(Constants.ERROR, badInputException.getMessage());
  }

  @Test
  void testBadInputExceptionStringThrowable() {
    Throwable t = new Throwable();
    badInputException = new BadInputException(Constants.ERROR, t);
    assertEquals(Constants.ERROR, badInputException.getMessage());
    assertEquals(badInputException.getCause(), t);
  }

  @Test
  void testBadInputExceptionThrowable() {
    Throwable t = new Throwable();
    badInputException = new BadInputException(t);
    assertEquals(badInputException.getCause(), t);
  }
}
