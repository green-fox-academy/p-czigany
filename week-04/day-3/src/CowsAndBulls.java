import java.util.Random;
import java.util.Scanner;

class CowsAndBulls {

  /*
  Create a class what is capable of playing exactly one game of Cows and Bulls (CAB). The player
  have to guess a 4 digit number. For every digit that the player guessed correctly in the correct
  place, they have a “cow”. For every digit the player guessed correctly in the wrong place is a “bull.”

    The CAB object should have a random 4 digit number, which is the goal to guess.
    The CAB object should have a state where the game state is stored (playing, finished).
    The CAB object should have a counter where it counts the guesses.
    The CAB object should have a guess method, which returns a string of the guess result
    All methods, including constructor should be tested
   */

  private String number;
  private GameState gameState;
  private int guesses;

  CowsAndBulls() {
    this.number = randomizeFourDigits();
    this.gameState = GameState.PLAYING;
    this.guesses = 0;
  }

  String getNumber() {
    return number;
  }

  GameState getGameState() {
    return gameState;
  }

  int getGuesses() {
    return guesses;
  }

  String randomizeFourDigits() {
    StringBuilder random4Digits = new StringBuilder();
    Random rnd = new Random();
    for (int i = 0; i < 4; i++) {
      random4Digits.append(rnd.nextInt(10));
    }
    return random4Digits.toString();
  }

  String guess() {
    StringBuilder answer = new StringBuilder();
    int cows = 0;
    int bulls = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Guess! (Type 4 digits.)");
    String guess = scan.nextLine();
    for (int i = 0; i < 4; i++) {
      char examinedLetter = guess.charAt(i);
      if (examinedLetter == number.charAt(i)) {
        cows++;
      } else if (number.contains(String.valueOf(examinedLetter))) {
        bulls++;
      }
    }
    answer
        .append("Cows: ")
        .append(cows)
        .append("\n")
        .append("Bulls: ")
        .append(bulls)
        .append("\n");
    if (cows == 4) {
      gameState = GameState.FINISHED;
    }
    return answer.toString();
  }

  public static void main(String[] args) {
    CowsAndBulls myGame = new CowsAndBulls();
    while (!myGame.gameState.equals(GameState.FINISHED)) {
      System.out.println(myGame.guess());
    }
  }
}
