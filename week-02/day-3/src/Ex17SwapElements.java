import java.util.Arrays;

/**
 * Created by peter on 2017.03.22..
 */
public class Ex17SwapElements {

  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    String buffer = abc[0];
    abc[0] = abc [2];
    abc[2] = buffer;
    System.out.println(Arrays.toString(abc));
  }
}
