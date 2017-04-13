import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi05ElementFinder {

  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    String message = (arrayList.contains(7)) ? "Hoorray" : "Noooooo";
    System.out.println(message);
  }
}
