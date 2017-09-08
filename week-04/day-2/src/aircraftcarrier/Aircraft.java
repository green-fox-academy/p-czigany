package aircraftcarrier;

public class Aircraft {

  private int maxAmmo;
  private int currentAmmo;
  private int baseDamage;

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
    int ammoToLoad = toLoad;
    while (toLoad != 0 && currentAmmo != maxAmmo) {
      this.currentAmmo++;
      ammoToLoad--;
    }
    return ammoToLoad;
  }

  int totalDamage() {
    return currentAmmo * baseDamage;
  }

  private String getType() {
    return this.getClass().getName().substring(this.getClass().getName().indexOf(".") + 1);
  }

  String getStatus() {
    return "Type " + getType() + ", Ammo: " + getCurrentAmmo() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + totalDamage();
  }

  int getMaxAmmo() {
    return maxAmmo;
  }

  int getCurrentAmmo() {
    return currentAmmo;
  }

  int getBaseDamage() {
    return baseDamage;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }
}
