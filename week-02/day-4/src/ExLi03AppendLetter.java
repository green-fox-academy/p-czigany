import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi03AppendLetter {

  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(
            Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    for (String anima :
            far) {
      far.set(far.indexOf(anima), anima += "a");
    }
    System.out.println(far);
  }
}
