import java.util.Random;

public class Pirate {

  private int intoxication;
  private boolean conscious;
  private boolean alive;
  private static final String DEAD = "They are dead.";
  private static final String KO = "They are knocked out.";

  Pirate() {
    intoxication = 0;
    conscious = true;
    alive = true;
  }

  public int getIntoxication() {
    return intoxication;
  }

  public boolean isConscious() {
    return conscious;
  }

  public boolean isAlive() {
    return alive;
  }

  public void drinkSomeRum() {
    if (!alive) {
      System.out.println(DEAD);
    } else {
      intoxication++;
    }
  }

  void howsItGoingMate() {
    if (!alive) {
      System.out.println(DEAD);
    } else if (!conscious) {
      System.out.println(KO);
    } else if (intoxication < 5) {
      System.out.println("\"Pour me anudder!\"");
    } else {
      System.out.println("\"Arghh, I'ma Pirate. How d'ya d'ink its goin?\"");
      conscious = false;
    }
  }

  void die() {
    alive = false;
  }

  void brawl(Pirate target) {
    if (!alive || !conscious) {
      return;
    }
    if (!target.alive) {
      System.out.println("Target is already dead.");
    } else if (!target.conscious) {
      target.alive = false;
    } else {
      fistfight(this, target);
    }
  }

  private void fistfight(Pirate fighter, Pirate target) {
    int d3roll = new Random().nextInt(3) + 1;
    switch (d3roll) {
      case 1:
        fighter.alive = false;
        break;
      case 2:
        target.alive = false;
        break;
      case 3:
        fighter.conscious = false;
        target.conscious = false;
        break;
      default:
        break;
    }
  }
}
