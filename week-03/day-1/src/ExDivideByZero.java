import java.util.Arrays;

public class ExDivideByZero {


  // create a function that takes a number
  // divides ten with it,
  // and prints the result.
  // it should print "fail" if the parameter is 0

  public static void main(String[] args) {
    divideTenBy(0);
  }

  private static void divideTenBy(int divisor) {
    try {
      System.out.println(10 / divisor);
    } catch (ArithmeticException ex) {
      System.out.println("Cannot divide by zero! " + Arrays.toString(ex.getStackTrace()));
    }
  }
}
