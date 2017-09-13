package twentyplusone;

import java.util.Objects;

class Card {

  private CardSuit suit;
  private CardRank rank;

  Card(CardRank rank, CardSuit suit) {
    this.suit = suit;
    this.rank = rank;
  }

  CardColor getColor() {
    if (suit.equals(CardSuit.CLUBS) && suit.equals(CardSuit.SPADES)) {
      return CardColor.BLACK;
    }
    return CardColor.RED;
  }

  CardSuit getSuit() {
    return suit;
  }

  CardRank getRank() {
    return rank;
  }

  String printCard() {
    return rank.name() + " " + suit.name();
  }

  @Override
  public boolean equals(Object o) {
      if (!(o instanceof Card)) {
        return false;
      }
      Card otherCard = (Card) o;
      return Objects.equals(this.suit, otherCard.suit) &&
          Objects.equals(this.rank, otherCard.rank);
    }

    @Override
    public int hashCode() {
      return Objects.hash(suit, rank);
    }
  }

