package creditcard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CreditCardTest {

  private CreditCard myCreditCard = new CreditCard();

  @Test
  void countCVV() {
    assertEquals(
        69,
        myCreditCard.cumeSumCVV("6765350286622461"));
  }
}
