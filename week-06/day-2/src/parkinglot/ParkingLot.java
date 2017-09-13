package parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ParkingLot {

  private List<Car> parkedCars;

  ParkingLot() {
    this.parkedCars = new ArrayList<>();
  }

  Car randomCar() {
    return new Car(randomColor(), randomType());
  }

  private CarColor randomColor() {
    int d4 = new Random().nextInt(4) + 1;
    switch (d4) {
      case 1: return CarColor.WHITE;
      case 2: return CarColor.BLUE;
      case 3: return CarColor.ORANGE;
      default: return CarColor.GREEN;
    }
  }

  private CarType randomType() {
    int d4 = new Random().nextInt(4) + 1;
    switch (d4) {
      case 1: return CarType.SUZUKI;
      case 2: return CarType.MERCEDES;
      case 3: return CarType.OPEL;
      default: return CarType.VOLVO;
    }
  }

  List<Car> getParkedCars() {
    return parkedCars;
  }
}
