package parkinglot;

import java.util.List;

/**
 * Created by peter on 2017.04.19..
 */
public class ParkingLot {

  private List<Car> parkedCars;

  public Car randomCar() {
    return new Car(randomColor(), randomType());
  }


  CarColor randomColor() {
    int d4 = (int) (Math.random() * 4) + 1;
    if (d4 == 1) {
      return CarColor.WHITE;
    } else if (d4 == 2) {
      return CarColor.BLUE;
    } else if (d4 == 3) {
      return CarColor.ORANGE;
    } else {
      return CarColor.GREEN;
    }
  }

  CarType randomType() {
    int d4 = (int) (Math.random() * 4) + 1;
    if (d4 == 1) {
      return CarType.SUZUKI;
    } else if (d4 == 2) {
      return CarType.MERCEDES;
    } else if (d4 == 3) {
      return CarType.OPEL;
    } else {
      return CarType.VOLVO;
    }
  }
}
