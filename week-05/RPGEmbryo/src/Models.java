import java.util.ArrayList;

/**
 * Created by peter on 2017.04.12..
 */
public class Models {

  private ArrayList<GameObject> gameObjects;

  public Models() {
    gameObjects = new ArrayList<>();
    Map map = new Map();
    for (Tile tile :
            map.getTileMap()) {
      gameObjects.add(tile);
    }
  }

  public ArrayList<GameObject> getGameObjects() {
    return gameObjects;
  }
}
