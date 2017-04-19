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
  }
}
