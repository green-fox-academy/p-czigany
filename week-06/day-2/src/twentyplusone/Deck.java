package twentyplusone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

  private List<Card> cards;

  Deck(int numberOfCards) {
    this.cards = new ArrayList<>();
    fill(numberOfCards);
  }

  public void shuffleDeck() {
    List<Card> shuffledDeck = new ArrayList<>();
    while (!cards.isEmpty()) {
      shuffledDeck.add(cards.remove(new Random().nextInt(cards.size())));
    }
    cards = shuffledDeck;
  }

  Card pullFirst() {
    return cards.remove(0);
  }

  public Card pullLast() {
    return cards.remove(cards.size() - 1);
  }

  public Card pullRandom() {
    int randomIndex = new Random().nextInt(cards.size());
    return cards.remove(randomIndex);
  }

  private void fill(int numberOfCards) {
    for (int i = 0; i < numberOfCards; i++) {
      while (cards.size() < i + 1) {
        Card toAdd = randomCard();
        if (!cards.contains(toAdd)) {
          cards.add(toAdd);
        }
      }
    }
  }

  private CardRank randomRank() {
    int d13 = new Random().nextInt(13) + 1;
    switch (d13) {
      case 1: return CardRank.ACE;
      case 2: return CardRank.TWO;
      case 3: return CardRank.THREE;
      case 4: return CardRank.FOUR;
      case 5: return CardRank.FIVE;
      case 6: return CardRank.SIX;
      case 7: return CardRank.SEVEN;
      case 8: return CardRank.EIGHT;
      case 9: return CardRank.NINE;
      case 10: return CardRank.TEN;
      case 11: return CardRank.JACK;
      case 12: return CardRank.QUEEN;
      default: return CardRank.KING;
    }
  }

  private CardSuit randomSuit() {
    int d4 = new Random().nextInt(4) + 1;
    switch (d4) {
      case 1: return CardSuit.SPADES;
      case 2: return CardSuit.HEARTS;
      case 3: return CardSuit.DIAMONDS;
      default: return CardSuit.CLUBS;
    }
  }

  private Card randomCard() {
    return new Card(randomRank(), randomSuit());
  }
}
