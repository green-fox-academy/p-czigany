/**
 * Created by peter on 2017.03.23..
 */
public class ExStr05Reverse {

  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    reversed = stringReverse(reversed);
    System.out.println(reversed);
  }

  public static String stringReverse(String toReverse) {
    String reversed = "";
    for (int i = toReverse.length(); i > 0; i--) {
      reversed += toReverse.charAt(i - 1);
    }
    return reversed;
  }
}
