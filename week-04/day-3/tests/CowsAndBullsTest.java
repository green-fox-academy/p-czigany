import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CowsAndBullsTest {

  @Test
  void randomNumberTest() {
    CowsAndBulls myGame = new CowsAndBulls();
    String my4Digits = myGame.randomizeFourDigits();
    assertTrue(my4Digits.length() == 4);
    int number;
    for (char digit : my4Digits.toCharArray()) {
      number = Character.getNumericValue(digit);
      assertTrue(number > -1 && number < 10);
    }
  }
}
