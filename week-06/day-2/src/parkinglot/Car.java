package parkinglot;

class Car {

  private CarType type;
  private CarColor color;

  Car(CarColor color, CarType type) {
    this.color = color;
    this.type = type;
  }

  CarType getType() {
    return type;
  }

  CarColor getColor() {
    return color;
  }
}
