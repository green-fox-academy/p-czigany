/**
 * Created by peter on 2017.03.22..
 */
public class Ex16AppendA {

  public static void main(String[] args) {
    String[] nimals = {"kuty", "macsk", "cic"};
    for (String beginning : nimals) {
      System.out.println(appendA(beginning));
    }
  }

  public static String appendA(String beginning) {
    return beginning + "a";
  }
}
