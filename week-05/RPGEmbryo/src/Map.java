import java.nio.file.Paths;
import java.util.List;

/**
 * Created by peter on 2017.04.12..
 */
public class Map {

  int TILEHEIGHT = 72;
  int TILEWIDTH = 72;
  private Tile[][] tileMap;

  public Map() {
    tileMap = new Tile[10][10];
    FileHandler handler = new FileHandler();
    List<String> mapLines = handler.readFromFile(Paths.get("assets/map.txt"));
    for (int i = 0; i < tileMap.length; i++) {
      for (int j = 0; j < tileMap[i].length; j++) {
        tileMap[i][j] = (mapLines.get(j).charAt(i) == '1') ? new Floor(i * TILEWIDTH, j * TILEHEIGHT) : new Wall(i * TILEWIDTH, j * TILEHEIGHT);
      }
    }
  }

  public Tile getTile(int dimX, int dimY) {
    return tileMap[dimX][dimY];
  }
}
