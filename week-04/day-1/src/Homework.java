import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by peter on 2017.03.23..
 */
public class Homework {

  public static void main(String... args) {
    ArrayList<Map<String, Object>> map = new ArrayList<>();

    Map<String, Object> fa0 = new HashMap<>();
    fa0.put("type", "Olaf");
    fa0.put("age", 12);
    fa0.put("leaf color", Color.TRANSLUCENT);
    fa0.put("sex", "male");
    map.add(fa0);

    Map<String, Object> fa1 = new HashMap<>();
    fa1.put("type", "Olaf");
    fa1.put("age", 12);
    fa1.put("leaf color", Color.CYAN);
    fa1.put("sex", "male");
    map.add(fa1);

    Map<String, Object> fa2 = new HashMap<>();
    fa2.put("type", "Olaf");
    fa2.put("age", 12);
    fa2.put("leaf color", Color.BLUE);
    fa2.put("sex", "male");
    map.add(fa2);

    Map<String, Object> fa3 = new HashMap<>();
    fa3.put("type", "Olaf");
    fa3.put("age", 12);
    fa3.put("leaf color", Color.getHSBColor(.2f, .4f, .6f));
    fa3.put("sex", "male");
    map.add(fa3);

    Map<String, Object> fa4 = new HashMap<>();
    fa4.put("type", "Olaf");
    fa4.put("age", 12);
    fa4.put("leaf color", Color.GREEN);
    fa4.put("sex", "male");
    map.add(fa4);
  }
}
