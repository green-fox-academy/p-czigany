package parkinglot;

/**
 * Created by peter on 2017.04.19..
 */
public class Car {

  private CarType type;
  private CarColor color;

  public Car(CarColor color, CarType type) {
    this.color = color;
    this.type = type;
  }

  public CarType getType() {
    return type;
  }

  public CarColor getColor() {
    return color;
  }
}
