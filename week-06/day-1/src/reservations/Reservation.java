package reservations;

import java.util.Random;

public class Reservation implements Reservationy {

  @Override
  public String getDowBooking() {
    int randomDay = new Random().nextInt(7) + 1;
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
    StringBuilder codeToReturn = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      int random = new Random().nextInt(36) - 10;
      if (random < 0) {
        codeToReturn.append(random + 10);
      } else {
        codeToReturn.append(String.valueOf((char) ('A' + random)));
      }
    }
    return codeToReturn.toString();
  }

  public String toString() {
    return String.format("Booking# %s for %s", getCodeBooking(), getDowBooking());
  }
}
