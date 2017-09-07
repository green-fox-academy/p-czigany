import java.util.List;

class Armada {

  private List<Ship> ships;

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
