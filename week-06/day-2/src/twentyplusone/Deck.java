package twentyplusone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.19..
 */
public class Deck {

  private List<Card> cards;

  public Deck(int numberOfCards) {
    this.cards = new ArrayList<>();
    fill(numberOfCards);
  }

  public void shuffleDeck() {
    List<Card> shuffledDeck = new ArrayList<>();
    while (cards.size() > 0) {
      shuffledDeck.add(cards.remove((int) (Math.random() * cards.size())));
    }
    cards = shuffledDeck;
  }

  public Card pullFirst() {
    return cards.remove(0);
  }

  public Card pullLast() {
    return cards.remove(cards.size() - 1);
  }

  public Card pullRandom() {
    int randomIndex = (int) (Math.random() * cards.size());
    return cards.remove(randomIndex);
  }

  public void fill(int numberOfCards) {
    for (int i = 0; i < numberOfCards; i++) {
      while (cards.size() < i + 1) {
        Card toAdd = randomCard();
        boolean addable = true;
        if (i > 0) {
          for (Card examinedCard :
                  cards) {
            if (toAdd.printCard().equals(examinedCard.printCard())) {
              addable = false;
            }
          }
        }
        if (addable) {
          cards.add(toAdd);
        }
      }
    }
  }

  public CardRank randomRank() {
    int d13 = (int) (Math.random() * 13) + 1;
    if (d13 == 1) {
      return CardRank.ACE;
    } else if (d13 == 2) {
      return CardRank.TWO;
    } else if (d13 == 3) {
      return CardRank.THREE;
    } else if (d13 == 4) {
      return CardRank.FOUR;
    } else if (d13 == 5) {
      return CardRank.FIVE;
    } else if (d13 == 6) {
      return CardRank.SIX;
    } else if (d13 == 7) {
      return CardRank.SEVEN;
    } else if (d13 == 8) {
      return CardRank.EIGHT;
    } else if (d13 == 9) {
      return CardRank.NINE;
    } else if (d13 == 10) {
      return CardRank.TEN;
    } else if (d13 == 11) {
      return CardRank.JACK;
    } else if (d13 == 12) {
      return CardRank.QUEEN;
    } else {
      return CardRank.KING;
    }
  }

  public CardSuit randomSuit() {
    int d4 = (int) (Math.random() * 4) + 1;
    if (d4 == 1) {
      return CardSuit.SPADES;
    } else if (d4 == 2) {
      return CardSuit.HEARTS;
    } else if (d4 == 3) {
      return CardSuit.DIAMONDS;
    } else {
      return CardSuit.CLUBS;
    }
  }

  public Card randomCard() {
    return new Card(randomRank(), randomSuit());
  }
}
