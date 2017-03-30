/**
 * Created by peter on 2017.03.30..
 */
public class Ex10Fibonacci {

  public static void main(String[] args) {
    System.out.println(fibonacci(6));
  }

  public static int fibonacci(int nth) {
    if (nth == 1) {
      return 0;
    } else if (nth == 2) {
      return 1;
    } else {
      return fibonacci(nth - 1) + fibonacci(nth - 2);
    }
  }
}
