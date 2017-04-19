package twentyplusone;

/**
 * Created by peter on 2017.04.19..
 */
public class Card {

  private CardColor color;
  private CardSuit suit;
  private CardRank rank;

  public Card(CardRank rank, CardSuit suit) {
    this.suit = suit;
    if (suit.equals(CardSuit.CLUBS) && suit.equals(CardSuit.SPADES)) {
      color = CardColor.BLACK;
    } else {
      color = CardColor.RED;
    }
    this.rank = rank;
  }

  public CardSuit getSuit() {
    return suit;
  }

  public CardRank getRank() {
    return rank;
  }

  public String printCard() {
    return rank.name() + " " + suit.name();
  }
}
