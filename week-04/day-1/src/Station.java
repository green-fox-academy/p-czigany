public class Station {

  private int gasAmount = 250;

  public Station() {
  }

  public void refill(Car car) {
    car.gasAmount++;
    gasAmount--;
  }

}
