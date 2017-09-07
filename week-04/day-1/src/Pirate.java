import java.util.Random;

public class Pirate {

  private int intoxication;
  private boolean conscious;
  private boolean alive;
  private static final String DEAD = "They are dead.";

  Pirate() {
    intoxication = 0;
    conscious = true;
    alive = true;
  }

  public void drinkSomeRum() {
    if (!alive) {
      System.out.println(DEAD);
      return;
    }
    intoxication++;
  }

  void howsItGoingMate() {
    if (!alive) {
      System.out.println(DEAD);
      return;
    }
    if (intoxication < 5) {
      System.out.println("\"Pour me anudder!\"");
      return;
    }
    System.out.println("\"Arghh, I'ma Pirate. How d'ya d'ink its goin?\"");
    conscious = false;
  }

  private void die() {
    if (!alive) {
      System.out.println(DEAD);
      return;
    }
    alive = false;
  }

  void brawl(Pirate target) {
    if (!target.alive) {
      System.out.println("They are already dead.");
      return;
    }
    if (!target.conscious) {
      target.die();
      return;
    }
    Random r = new Random();
    int d3roll = r.nextInt(3) + 1;
    switch (d3roll) {
      case 1:
        alive = false;
        break;
      case 2:
        target.alive = false;
        break;
      case 3:
        conscious = false;
        target.conscious = false;
        break;
      default:
        break;
    }
  }
}
