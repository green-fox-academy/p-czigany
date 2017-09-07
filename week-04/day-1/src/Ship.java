import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

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
}
