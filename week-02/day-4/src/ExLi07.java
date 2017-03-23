import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi07 {

  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<>(
            Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    // What I cannot create, I do not understand.
    String swap = list.get(list.indexOf("cannot"));
    list.set(list.indexOf("cannot"), list.get(list.indexOf("do")));
    list.set(list.indexOf("do"), swap);
    printer(list);

  }

  public static void printer(ArrayList<String> list) {
    for (String listEntry :
            list) {
      System.out.print(listEntry);
      if (list.indexOf(listEntry) != list.size() - 1) {
        System.out.print(" ");
      }
    }
  }
}