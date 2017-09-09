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

  @Test
  void guessValidatorTest() {
    assertTrue(myGame.validateGuess("0000"));
    assertTrue(myGame.validateGuess("1000"));
    assertTrue(myGame.validateGuess("0001"));
    assertTrue(myGame.validateGuess("9356"));
    assertFalse(myGame.validateGuess("000"));
    assertFalse(myGame.validateGuess("100"));
    assertFalse(myGame.validateGuess("001"));
    assertFalse(myGame.validateGuess("999"));
    assertFalse(myGame.validateGuess(""));
    assertFalse(myGame.validateGuess(null));
  }
}
