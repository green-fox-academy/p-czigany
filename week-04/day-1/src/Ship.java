import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Ship {

  private List<Pirate> crew;
  private Pirate captain;

  Ship() {
    this.crew = new ArrayList<>();
  }

  void fillShip() {
    captain = new Pirate();
    int numberOfPirates = new Random().nextInt(100) + 1;
    for (int i = 0; i < numberOfPirates; i++) {
      crew.add(new Pirate());
    }
  }

  void status() {
    System.out.println("======================");
    System.out.println("Captain's consumed rums: " + captain.getIntoxication());
    System.out.print("Captain's state: ");
    if (!captain.isAlive()) {
      System.out.println("Dead");
    } else if (!captain.isConscious()) {
      System.out.println("K.O.");
    } else {
      System.out.println("Okay");
    }
    int livingCrew = countLivingCrew();
    System.out.println("# of alive crew members: " + livingCrew);
    System.out.println("======================");
  }

  private int countLivingCrew() {
    int lives = 0;
    for (Pirate examined : crew) {
      if (examined.isAlive()) {
        lives++;
      }
    }
    return lives;
  }

  boolean battle(Ship enemyShip) {
    int aliveAttackerPirates = countLivingCrew();
    int aliveEnemyPirates = enemyShip.countLivingCrew();
    Pirate enemyCaptain = enemyShip.captain;
    int attackerScore = aliveAttackerPirates - captain.getIntoxication();
    int enemyScore = aliveEnemyPirates - enemyCaptain.getIntoxication();
    Ship winner = (attackerScore > enemyScore) ? this : enemyShip;
    Ship loser = (winner == this) ? enemyShip : this;
    loser.casualties();
    winner.party();
    return (winner == this);
  }

  private void casualties() {
    int foughtInBattle = countLivingCrew();
    int deaths = new Random().nextInt(foughtInBattle) + 1;
    int i = 0;
    int j = 0;
    while (i < deaths) {
      if (crew.get(j).isAlive()) {
        crew.get(j).die();
        i++;
      }
      j++;
    }
  }

  private void party() {
    int rums = new Random().nextInt(countLivingCrew() * 2) + 1;
    for (int i = 0; i < rums; i++) {
      giveRumRandomly();
    }
  }

  private void giveRumRandomly() {
    boolean givenOut = false;
    Random rnd = new Random();
    while (!givenOut) {
      int randomPirateIndex = rnd.nextInt(countLivingCrew() + 1);
      if (randomPirateIndex == 0) {
        if (captain.isAlive() && captain.isConscious()) {
          captain.drinkSomeRum();
          givenOut = true;
        }
      } else {
        Pirate rumTarget = crew.get(randomPirateIndex - 1);
        if (rumTarget.isAlive() && rumTarget.isConscious()) {
          rumTarget.drinkSomeRum();
          givenOut = true;
        }
      }
    }
  }
}
