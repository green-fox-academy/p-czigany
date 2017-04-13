import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by peter on 2017.03.23..
 */
public class ExMap02StudentCounter {

  public static void main(String... args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add(row0);

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Gerzson");
    row1.put("age", 10);
    row1.put("candies", 1);
    map.add(row1);

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Aurel");
    row2.put("age", 7);
    row2.put("candies", 3);
    map.add(row2);

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Zsombor");
    row3.put("age", 12);
    row3.put("candies", 5);
    map.add(row3);

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Olaf");
    row4.put("age", 12);
    row4.put("candies", 7);
    map.add(row4);

    Map<String, Object> row5 = new HashMap<String, Object>();
    row5.put("name", "Teodor");
    row5.put("age", 3);
    row5.put("candies", 2);
    map.add(row5);

    whoHasMoreCandies(4, map);
    ageSumOfLessCandyOwnersThan(5, map);
  }

  public static void whoHasMoreCandies(int moreThan, ArrayList<Map<String, Object>> boys) {
    System.out.println("Those with more than " + moreThan + " candies:");
    for (Map<String, Object> entry : boys) {
      if ((int) entry.get("candies") > moreThan) {
        System.out.println(" - " + entry.get("name"));
      }
    }
    System.out.println();
  }

  public static void ageSumOfLessCandyOwnersThan(int lessThan,
          ArrayList<Map<String, Object>> boys) {
    double ageSum = 0.0;
    for (Map<String, Object> entry : boys) {
      if ((Integer) entry.get("candies") < lessThan) {
        ageSum += ((Number) entry.get("age")).doubleValue();
      }
    }
    System.out.println("Total age of those with less than " + lessThan + " candies: " + ageSum);
  }
}
