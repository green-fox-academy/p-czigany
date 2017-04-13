import java.util.Scanner;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi08Calculator {

  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(
            "Give me some operation (+, -, *, /, %) and two operands (whole numbers), separated by spaces!");
    String operation = scan.next();
    int a = scan.nextInt();
    int b = scan.nextInt();
    if (operation.equals("+")) {
      System.out.println(a + b);
    } else if (operation.equals("-")) {
      System.out.println(a - b);
    } else if (operation.equals("*")) {
      System.out.println(a * b);
    } else if (operation.equals("/")) {
      System.out.println(a / (float) b);
    } else if (operation.equals("%")) {
      System.out.println(a % b);
    } else {
      System.exit(0);
    }
  }
}
