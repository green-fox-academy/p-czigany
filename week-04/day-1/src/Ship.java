import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> crew;
  private Pirate captain;

  Ship() {
    this.crew = new ArrayList<>();
  }

  void fillShip(){
    captain = new Pirate();
    int numberOfPirates = new Random().nextInt(100) + 1;
    for (int i = 0; i < numberOfPirates; i++) {
      crew.add(new Pirate());
    }
  }
}
