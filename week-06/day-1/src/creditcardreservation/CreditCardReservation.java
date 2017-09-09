package creditcardreservation;

import creditcard.CreditCard;
import creditcard.CreditCardy;
import reservations.Reservation;
import reservations.Reservationy;

public class CreditCardReservation implements CreditCardy, Reservationy {

  private CreditCard creditCard;
  private Reservation reservation;

  CreditCardReservation() {
    this.creditCard = new CreditCard();
    this.reservation = new Reservation();
  }

  @Override
  public int getSumCVV() {
    return creditCard.getSumCVV();
  }

  @Override
  public String getNameCardholder() {
    return creditCard.getNameCardholder();
  }

  @Override
  public String getCodeAccount() {
    return creditCard.getCodeAccount();
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    return creditCard.cumeSumCVV(creditCard.getCodeAccount());
  }

  @Override
  public String getDowBooking() {
    return reservation.getDowBooking();
  }

  @Override
  public String getCodeBooking() {
    return reservation.getCodeBooking();
  }

  @Override
  public String toString() {
    return reservation.toString() + " paid by " + creditCard.toString();
  }
}
