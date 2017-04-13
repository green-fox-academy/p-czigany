package gardenapplication;

/**
 * Created by peter on 2017.04.04..
 */
public class Plant {

  private String color;
  private double waterHeld, absorbRatio;
  private int wateredIf;

  // Constructors:

  public Plant(String color, int wateredIf, double absorbRatio) {
    this.waterHeld = 0;
    this.color = color;
    this.wateredIf = wateredIf;
    this.absorbRatio = absorbRatio;
  }

  // Getters:

  public String getColor() {
    return color;
  }

  public double getWaterHeld() {
    return waterHeld;
  }

  public int getWateredIf() {
    return wateredIf;
  }

  public double getAbsorbRatio() {
    return absorbRatio;
  }

  boolean needsWater() {
    return (getWaterHeld() < getWateredIf());
  }

  // Setters:

  public void setWaterHeld(double waterHeld) {
    this.waterHeld = waterHeld;
  }
}
