public class Pirate {

  private int intoxication;
  private boolean conscious;
  private boolean alive;

  public Pirate() {
    intoxication = 0;
    conscious = true;
    alive = true;
  }

  public void drinkSomeRum() {
    intoxication++;
  }
}
