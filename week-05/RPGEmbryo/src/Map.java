import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.12..
 */
public class Map {

  int TILEHEIGHT = 72;
  int TILEWIDTH = 72;
  private ArrayList<ArrayList<Tile>> tileMap;

  public Map() {
    tileMap = new ArrayList<>();
    FileHandler handler = new FileHandler();
    List<String> mapLines = handler.readFromFile(Paths.get("assets/map.txt"));
    for (int i = 0; i < mapLines.size(); i++) {
      tileMap.add(new ArrayList<>());
      for (int j = 0; j < mapLines.get(i).length(); j++) {
        if (mapLines.get(j).charAt(i) == '1') {
          tileMap.get(i).add(new Floor(i * TILEWIDTH, j * TILEHEIGHT));
        } else if (mapLines.get(j).charAt(i) == '0') {
          tileMap.get(i).add(new Wall(i * TILEWIDTH, j * TILEHEIGHT));
        }
      }
    }
  }

  public ArrayList<ArrayList<Tile>> getTileMap() {
    return tileMap;
  }
}
