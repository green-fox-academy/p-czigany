package twentyplusone;

import java.util.Scanner;

/**
 * Created by peter on 2017.04.19..
 */
public class Game {

  public Game() {
    Deck myDeck = new Deck(52);
    int dealerScore = (int) (Math.random() * 7) + 15;
    int playerScore = 0;

    String userResponse = "continue";

    Scanner scan = new Scanner(System.in);
    while ((userResponse.equals("continue")) && !(playerScore > 21)) {
      Card pulled = myDeck.pullFirst();
      System.out.println("That is the " + pulled.getRank().name() + " of " + pulled.getSuit().name() + "!");
      playerScore += value(pulled);
      System.out.println("The dealer's score is: " + dealerScore);
      System.out.println("Your current score is: " + playerScore);
      System.out.println("Do you want to continue or to stop? (Type 'continue' or 'stop'.)");
      userResponse = scan.next();
    }
    System.out.println("The dealer's score is: " + dealerScore);
    System.out.println("Your final score is: " + playerScore);
    if (playerScore > dealerScore && playerScore <= 21) {
      System.out.println("YOU WIN.");
    } else {
      System.out.println("YOU LOSE.");
    }
  }

  public int value(Card card) {
    if (card.getRank().equals(CardRank.ACE)) {
      return 11;
    } else if (card.getRank().equals(CardRank.TWO)) {
      return 2;
    } else if (card.getRank().equals(CardRank.THREE)) {
      return 3;
    } else if (card.getRank().equals(CardRank.FOUR)) {
      return 4;
    } else if (card.getRank().equals(CardRank.FIVE)) {
      return 5;
    } else if (card.getRank().equals(CardRank.SIX)) {
      return 6;
    } else if (card.getRank().equals(CardRank.SEVEN)) {
      return 7;
    } else if (card.getRank().equals(CardRank.EIGHT)) {
      return 8;
    } else if (card.getRank().equals(CardRank.NINE)) {
      return 9;
    } else {
      return 10;
    }
  }
}
