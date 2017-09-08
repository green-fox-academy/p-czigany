import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CowsAndBullsTest {

  private CowsAndBulls myGame = new CowsAndBulls();

  @Test
  void randomNumberTest() {
    String my4Digits = myGame.randomizeFourDigits();
    assertTrue(my4Digits.length() == 4);
    int number;
    for (char digit : my4Digits.toCharArray()) {
      number = Character.getNumericValue(digit);
      assertTrue(number > -1 && number < 10);
    }
  }

  @Test
  void constructorTest() {
    String my4Digits = myGame.getNumber();
    assertTrue(my4Digits.length() == 4);
    int number;
    for (char digit : my4Digits.toCharArray()) {
      number = Character.getNumericValue(digit);
      assertTrue(number > -1 && number < 10);
    }
    assertEquals(GameState.PLAYING, myGame.getGameState());
    assertEquals(0, myGame.getGuesses());
  }
}
