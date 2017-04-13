package aircraftcarrier;

/**
 * Created by peter on 2017.04.04..
 */
public class Aircraft {

  private int maxAmmo, currentAmmo, baseDamage;

  Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = 0;
  }

  int fight() {
    int burst = currentAmmo;
    this.currentAmmo = 0;
    return burst * baseDamage;
  }

  int refill(int toLoad) {
    while (toLoad != 0 && currentAmmo != maxAmmo) {
      this.currentAmmo++;
      toLoad--;
    }
    return toLoad;
  }

  int totalDamage() {
    return currentAmmo * baseDamage;
  }

  String getType() {
    return this.getClass().getName().substring(this.getClass().getName().indexOf(".") + 1);
  }

  String getStatus() {
    return "Type " + getType() + ", Ammo: " + getCurrentAmmo() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + totalDamage();
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }
}
