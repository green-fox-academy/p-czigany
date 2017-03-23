import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi06 {

  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    ArrayList<Integer> subList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    String message = (list.containsAll(subList)) ? "true" : "false";
    System.out.println(message);
  }

}
