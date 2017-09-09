/**
 * Created by peter on 2017.04.10..
 */
public class Area extends GameObject {
  boolean[][] floorPlan;

  public Area(String filename, int posX, int posY, boolean[][] floorPlan) {
    super(filename, posX, posY);
    this.floorPlan = floorPlan;
  }
}
