package theGardenApplication;

/**
 * Created by peter on 2017.04.04..
 */
public class Plant {

  private String color;
  private double waterHeld;
  private int wateredIf;
  private double absorbRatio;

  // Constructors:

  public Plant() {
    this.waterHeld = 0;
  }

  public Plant(String color, int wateredIf, double absorbRatio) {
    this.color = color;
    this.wateredIf = wateredIf;
    this.absorbRatio = absorbRatio;
    this.waterHeld = 0;
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
