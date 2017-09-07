import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Armada {

  private List<Ship> ships;

  Armada() {
    ships = new ArrayList<>();
  }

  void fillArmada() {
    int numberOfShips = new Random().nextInt(100) + 1;
    for (int i = 0; i < numberOfShips; i++) {
      ships.add(new Ship());
      ships.get(i).fillShip();
    }
  }

  boolean war(Armada enemyArmada) {
    int numberOfAttackingShips = ships.size();
    List<Ship> enemyShips = enemyArmada.ships;
    int numberOfEnemyShips = enemyShips.size();
    while (numberOfAttackingShips > 0 && numberOfEnemyShips > 0) {
      if (ships.get(numberOfAttackingShips - 1).battle(enemyShips.get(numberOfEnemyShips - 1))) {
        numberOfEnemyShips--;
      } else {
        numberOfAttackingShips--;
      }
    }
    return (numberOfAttackingShips != 0);
  }
}
