package reservations;

import java.util.Random;

public class Reservation implements Reservationy {

  @Override
  public String getDowBooking() {
    int randomDay = new Random().nextInt(7) + 1;
    String day;
    switch (randomDay) {
      case 1: day = "MON";
        break;
      case 2: day = "TUE";
        break;
      case 3: day = "WED";
        break;
      case 4: day = "THU";
        break;
      case 5: day = "FRI";
        break;
      case 6: day = "SAT";
        break;
      default: day = "SUN";
        break;
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

  @Override
  public String toString() {
    return String.format("Booking# %s for %s", getCodeBooking(), getDowBooking());
  }
}
