import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi02 {

  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(
            Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(
            Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();
    int n = 0;
    for (String girl : girls) {
      order.add(girl);
      order.add(boys.get(n));
      n++;
    }
    System.out.println(order);
  }
}
