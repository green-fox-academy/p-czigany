package reservations;

/**
 * Created by peter on 2017.04.18..
 */
public class Reservation implements Reservationy {

  @Override
  public String getDowBooking() {
    int randomDay = (int) (Math.random() * 7) + 1;
    String day;
    if (randomDay == 1) {
      day = "MON";
    } else if (randomDay == 2) {
      day = "TUE";
    } else if (randomDay == 3) {
      day = "WED";
    } else if (randomDay == 4) {
      day = "THU";
    } else if (randomDay == 5) {
      day = "FRI";
    } else if (randomDay == 6) {
      day = "SAT";
    } else {
      day = "SUN";
    }
    return day;
  }

  @Override
  public String getCodeBooking() {
    String codeToReturn = "";
    for (int i = 0; i < 8; i++) {
      int random = (int) (Math.random() * 36) - 10;
      if (random < 0) {
        codeToReturn += String.valueOf(random + 10);
      } else {
        codeToReturn += String.valueOf((char) ('A' + random));
      }
    }
    return codeToReturn;
  }

  public String toString() {
    return String.format("Booking# %s for %s", getCodeBooking(), getDowBooking());
  }
}
