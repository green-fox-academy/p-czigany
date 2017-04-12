import java.nio.file.Paths;
import java.util.List;

/**
 * Created by peter on 2017.04.12..
 */
public class Map {

  public boolean[][] getMap() {
    boolean[][] map = new boolean[10][10];
    FileHandler handler = new FileHandler();
    List<String> mapLines = handler.readFromFile(Paths.get("assets/map.txt"));
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        map[i][j] = (mapLines.get(j).charAt(i) == '1') ? true : false;
      }
    }
    return map;
  }
}
