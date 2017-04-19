package twentyplusone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.19..
 */
public class Deck {

  private List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<>();
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
}
