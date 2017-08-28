/**
 * Created by peter on 2017.03.30..
 */
public class Ex08StringsAgain {

  public static void main(String[] args) {
    String input = "Roxxor the Xoxxor is BAAACK!!!";
    System.out.println(xsRemove(input));
  }

  private static String xsRemove(String toTransform) {
    if (toTransform.length() < 1) {
      return "";
    } else {
      if (toTransform.charAt(0) == 'x') {
        return xsRemove(toTransform.substring(1));
      } else {
        return String.valueOf(toTransform.charAt(0)) + xsRemove(toTransform.substring(1));
      }
    }
  }
}
