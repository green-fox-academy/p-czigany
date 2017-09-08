package gardenapplication;

class Plant {

  private String color;
  private double waterHeld;
  private double absorbRatio;
  private int wateredIf;

  // Constructors:

  Plant(String color, int wateredIf, double absorbRatio) {
    this.waterHeld = 0;
    this.color = color;
    this.wateredIf = wateredIf;
    this.absorbRatio = absorbRatio;
  }

  // Getters:

  String getColor() {
    return color;
  }

  double getWaterHeld() {
    return waterHeld;
  }

  private int getWateredIf() {
    return wateredIf;
  }

  double getAbsorbRatio() {
    return absorbRatio;
  }

  boolean needsWater() {
    return (getWaterHeld() < getWateredIf());
  }

  // Setters:

  void setWaterHeld(double waterHeld) {
    this.waterHeld = waterHeld;
  }
}
