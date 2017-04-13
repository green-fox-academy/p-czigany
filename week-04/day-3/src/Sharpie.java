/**
 * Created by peter on 2017.04.05..
 */
public class Sharpie {

  String color;
  float width;
  float inkAmount;

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100f;
  }

  void use() {
    inkAmount--;
  }

  public boolean isUsable() {
    return (inkAmount > 0);
  }
}
