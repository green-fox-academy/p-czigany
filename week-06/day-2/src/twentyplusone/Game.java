package twentyplusone;

import java.util.Random;
import java.util.Scanner;

class Game {

  Game() {
    Deck myDeck = new Deck(52);
    int dealerScore = new Random().nextInt(7) + 15;
    int playerScore = 0;

    String userResponse = "continue";

    Scanner scan = new Scanner(System.in);
    while (userResponse.equals("continue")) {
      Card pulled = myDeck.pullFirst();
      System.out.println("That is the " + pulled.getRank().name() + " of " + pulled.getSuit().name() + "!");
      playerScore += value(pulled);
      System.out.println("The dealer's score is: " + dealerScore);
      System.out.println("Your current score is: " + playerScore);
      if ((playerScore > dealerScore) || (playerScore > 21)) break;
      System.out.println("Do you want to continue or to stop? (Type 'continue' or 'stop'.)");
      userResponse = scan.next();
    }
    scan.close();
    System.out.println("The dealer's score is: " + dealerScore);
    System.out.println("Your final score is: " + playerScore);
    determineWinner(playerScore, dealerScore);
  }

  private void determineWinner(int playerScore, int dealerScore) {
    if (playerScore > dealerScore && playerScore <= 21) {
      System.out.println("YOU WIN.");
    } else {
      System.out.println("YOU LOSE.");
    }
  }


  private int value(Card card) {
    switch (card.getRank()) {
      case ACE: return 11;
      case TWO: return 2;
      case THREE: return 3;
      case FOUR: return 4;
      case FIVE: return 5;
      case SIX: return 6;
      case SEVEN: return 7;
      case EIGHT: return 8;
      case NINE: return 9;
      default: return 10;
    }
  }
}
