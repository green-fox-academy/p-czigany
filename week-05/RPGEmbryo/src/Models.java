import java.util.ArrayList;

/**
 * Created by peter on 2017.04.12..
 */
public class Models {

  private ArrayList<Tile> gameObjects;
  private Map map;

  public Models() {
    gameObjects = new ArrayList<>();
    map = new Map();
    for (ArrayList<Tile> tileLine :
            map.getTileMap()) {
      for (Tile tile :
              tileLine) {
        gameObjects.add(tile);
      }
    }
  }

  public ArrayList<Tile> getGameObjects() {
    return gameObjects;
  }

  public Map getMap() {
    return map;
  }
}
