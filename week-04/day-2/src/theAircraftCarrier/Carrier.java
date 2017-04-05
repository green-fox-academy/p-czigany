package theAircraftCarrier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.04..
 */
public class Carrier {

  List<Aircraft> carriedPlanes;
  int ammoStored, healthPoints;

  Carrier(int initialAmmo) {
    this.carriedPlanes = new ArrayList<>();
    this.ammoStored = initialAmmo;
    this.healthPoints = 1000;
  }

  void addAircraft(String type) {
    if (type.equals("F16")) {
      this.carriedPlanes.add(new F16());
    } else if (type.equals("F35")) {
      this.carriedPlanes.add(new F35());
    }
  }

  void fill() {
    if (getAmmoStored() != 0) {
      int totalAmmoNeeded = 0;
      for (Aircraft toFill :
              carriedPlanes) {
        totalAmmoNeeded += toFill.getMaxAmmo() - toFill.getCurrentAmmo();
      }
      if (getAmmoStored() >= totalAmmoNeeded) {
        reloadPlanes(carriedPlanes);
      } else {
        List<Aircraft> f35sOnBoard = new ArrayList<>();
        List<Aircraft> f16sOnBoard = new ArrayList<>();
        for (Aircraft toPick :
                carriedPlanes) {
          if (toPick instanceof F35) {
            f35sOnBoard.add(toPick);
          } else {
            f16sOnBoard.add(toPick);
          }
        }
        reloadPlanes(f35sOnBoard);
        reloadPlanes(f16sOnBoard);
      }
    } else {
      System.out.println(
              "I wanna be an OutOfAmmoException: Reloading cannot start -- the Ammo Storage is already empty.");
    }
  }

  void reloadPlanes(List<Aircraft> planesToReload) {
    for (Aircraft toFill :
            planesToReload) {
      setAmmoStored(toFill.refill(getAmmoStored()));
    }
  }

  void fight(Carrier targetCarrier) {
    int damageTotal = 0;
    for (Aircraft attacking :
            carriedPlanes) {
      damageTotal += attacking.fight();
    }
    targetCarrier.setHealthPoints(targetCarrier.getHealthPoints() - damageTotal);
  }

  int totalDamage() {
    int sumDamage = 0;
    for (Aircraft plane :
            carriedPlanes) {
      sumDamage += plane.totalDamage();
    }
    return sumDamage;
  }

  String getStatus() {
    if (healthPoints <= 0) {
      return "It's dead Jim :(";
    } else {
      String status =
              "Aircraft count: " + carriedPlanes.size() + ", Ammo Storage: " + getAmmoStored()
                      + ", Total damage: " + totalDamage() + "\n" + "Aircrafts:\n";
      for (Aircraft plane :
              carriedPlanes) {
        status += plane.getStatus() + "\n";
      }
      return status;
    }
  }

  public int getAmmoStored() {
    return ammoStored;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setAmmoStored(int ammoStored) {
    this.ammoStored = ammoStored;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }
}
