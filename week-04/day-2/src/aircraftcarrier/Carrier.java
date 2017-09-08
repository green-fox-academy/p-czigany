package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

class Carrier {

  private List<Aircraft> carriedPlanes;
  private int ammoStored;
  private int healthPoints;

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
      if (ammoIsEnough()) {
        reloadPlanes(carriedPlanes);
      } else {
        List<Aircraft> f35sOnBoard = pickPlanes(F35.class);
        List<Aircraft> f16sOnBoard = pickPlanes(F16.class);
        reloadPlanes(f35sOnBoard);
        reloadPlanes(f16sOnBoard);
      }
    } else {
      System.out.println(
              "I wanna be an OutOfAmmoException: Reloading cannot start -- the Ammo Storage is already empty.");
    }
  }

  private boolean ammoIsEnough() {
    int totalAmmoNeeded = 0;
    for (Aircraft toFill :
            carriedPlanes) {
      totalAmmoNeeded += toFill.getMaxAmmo() - toFill.getCurrentAmmo();
    }
    return (getAmmoStored() >= totalAmmoNeeded);
  }

  private List<Aircraft> pickPlanes(Class classToPick) {
    List<Aircraft> pickedPlanes = new ArrayList<>();
    for (Aircraft examined :
            carriedPlanes) {
      if (classToPick.isInstance(examined)) {
        pickedPlanes.add(examined);
      }
    }
    return pickedPlanes;
  }

  private void reloadPlanes(List<Aircraft> planesToReload) {
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

  private int totalDamage() {
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
      StringBuilder status = new StringBuilder();
      status
          .append("Aircraft count: ")
          .append(carriedPlanes.size())
          .append(", Ammo Storage: ")
          .append(getAmmoStored())
          .append(", Total damage: ")
          .append(totalDamage())
          .append("\n")
          .append("Aircrafts:\n");

      for (Aircraft plane :
              carriedPlanes) {
        status
            .append(plane.getStatus())
            .append("\n");
      }
      return status.toString();
    }
  }

  private int getAmmoStored() {
    return ammoStored;
  }

  int getHealthPoints() {
    return healthPoints;
  }

  private void setAmmoStored(int ammoStored) {
    this.ammoStored = ammoStored;
  }

  private void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }
}
