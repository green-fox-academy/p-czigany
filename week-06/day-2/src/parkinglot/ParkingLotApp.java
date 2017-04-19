package parkinglot;

/**
 * Created by peter on 2017.04.19..
 */
public class ParkingLotApp {

  public static void main(String[] args) {
    ParkingLot myParkingLot = new ParkingLot();
    for (int i = 0; i < 256; i++) {
      myParkingLot.getParkedCars().add(myParkingLot.randomCar());
    }

    for (CarType currentType :
            CarType.values()) {
      int sum = 0;
      for (Car examinedCar :
              myParkingLot.getParkedCars()) {
        if (examinedCar.getType().equals(currentType)) {
          sum++;
        }
      }
      System.out.println(currentType.name() + ": " + sum + " db");
    }

    for (CarColor currentColor :
            CarColor.values()) {
      int sum = 0;
      for (Car examinedCar :
              myParkingLot.getParkedCars()) {
        if (examinedCar.getColor().equals(currentColor)) {
          sum++;
        }
      }
      System.out.println(currentColor.name() + ": " + sum + " pieces");
    }

    String mostPopular = "GREEN SUZUKI";
    int maxPopularity = 0;
    for (CarColor currentColor :
            CarColor.values()) {
      for (CarType currentType :
              CarType.values()) {
        int sum = 0;
        for (Car examinedCar :
                myParkingLot.getParkedCars()) {
          if (examinedCar.getColor().equals(currentColor) && examinedCar.getType()
                  .equals(currentType)) {
            sum++;
          }
        }
        System.out.println(currentColor.name() + " " + currentType.name() + ": " + sum + " pieces");
        if (sum > maxPopularity) {
          maxPopularity = sum;
          mostPopular = currentColor.name() + " " + currentType.name();
        }
      }
    }
    System.out.println("There are " + maxPopularity + " pieces of the most popular car in the parking lot. It is the " + mostPopular);
  }
}
