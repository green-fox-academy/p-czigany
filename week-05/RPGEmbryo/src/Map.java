import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.12..
 */
public class Map {

  int TILEHEIGHT = 72;
  int TILEWIDTH = 72;
  private ArrayList<Tile> tileMap;

  public Map() {
    tileMap = new ArrayList<>();
    FileHandler handler = new FileHandler();
    List<String> mapLines = handler.readFromFile(Paths.get("assets/map.txt"));
    for (int i = 0; i < mapLines.size(); i++) {
      for (int j = 0; j < mapLines.get(i).length(); j++) {
        if (mapLines.get(j).charAt(i) == '1') {
          tileMap.add(new Floor(i * TILEWIDTH, j * TILEHEIGHT));
        } else if (mapLines.get(j).charAt(i) == '0') {
          tileMap.add(new Wall(i * TILEWIDTH, j * TILEHEIGHT));
        }
      }
    }
  }

  public ArrayList<Tile> getTileMap() {
    return tileMap;
  }
}
