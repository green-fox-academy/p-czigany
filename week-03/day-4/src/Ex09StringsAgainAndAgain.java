/**
 * Created by peter on 2017.03.30..
 */
public class Ex09StringsAgainAndAgain {

  public static void main(String[] args) {
    String input = "Roxxor the Xoxxor is BAAACK!!!";
    System.out.println(xsRemove(input));
  }

  private static String xsRemove(String toTransform) {
    if (toTransform.length() < 2) {
      return toTransform;
    } else {
      return String.valueOf(toTransform.charAt(0)) + "*" + xsRemove(toTransform.substring(1));
    }
  }
}
