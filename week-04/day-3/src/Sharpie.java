class Sharpie {

  private String color;
  private float width;
  private float inkAmount;

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100f;
  }

  void use() {
    inkAmount--;
  }

  boolean isUsable() {
    return (inkAmount > 0);
  }
}
