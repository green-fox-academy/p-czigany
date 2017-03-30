/**
 * Created by peter on 2017.03.30..
 */
public class Ex07Strings {
  
  public static void main(String[] args) {
    String input = "Roxxor the Xoxxor is BAAACK!!!";
    System.out.println(xsToys(input));
  }

  public static String xsToys(String toTransform) {
    if (toTransform.length() < 1) {
      return "";
    } else {
      if (toTransform.charAt(0) == 'x') {
        return "y" + xsToys(toTransform.substring(1));
      } else {
        return String.valueOf(toTransform.charAt(0)) + xsToys(toTransform.substring(1));
      }
    }
  }
}
