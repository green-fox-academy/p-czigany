package parkinglot;

public class ParkingLotApp {

  public static void main(String[] args) {
    ParkingLot myParkingLot = new ParkingLot();

    random256CarsToLot(myParkingLot, 256);

    listNumberOfCarsByType(myParkingLot);

    listNumberOfCarsByColor(myParkingLot);

    countMaxPopularity(myParkingLot);
  }

  private static void countMaxPopularity(ParkingLot myParkingLot) {
    String mostPopular = "GREEN SUZUKI";
    int maxPopularity = 0;
    for (CarColor currentColor : CarColor.values()) {
      for (CarType currentType : CarType.values()) {
        int sum = 0;
        for (Car examinedCar : myParkingLot.getParkedCars()) {
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
    System.out.println("There are " + maxPopularity
        + " pieces of the most popular car in the parking lot. It is the " + mostPopular);
  }

  private static void listNumberOfCarsByColor(ParkingLot parkingLot) {
    for (CarColor currentColor : CarColor.values()) {
      int sum = 0;
      for (Car examinedCar :
          parkingLot.getParkedCars()) {
        if (examinedCar.getColor().equals(currentColor)) {
          sum++;
        }
      }
      System.out.println(currentColor.name() + ": " + sum + " pieces");
    }
  }

  private static void listNumberOfCarsByType(ParkingLot parkingLot) {
    for (CarType currentType : CarType.values()) {
      int sum = 0;
      for (Car examinedCar : parkingLot.getParkedCars()) {
        if (examinedCar.getType().equals(currentType)) {
          sum++;
        }
      }
      System.out.println(currentType.name() + ": " + sum + " db");
    }
  }

  private static void random256CarsToLot(ParkingLot parkingLot, int howManyCars) {
    for (int i = 0; i < howManyCars; i++) {
      parkingLot.getParkedCars().add(parkingLot.randomCar());
    }
  }
}
