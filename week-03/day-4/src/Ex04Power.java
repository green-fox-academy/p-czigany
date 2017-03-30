/**
 * Created by peter on 2017.03.30..
 */
public class Ex04Power {

  public static void main(String[] args) {
    System.out.println(power(5, 2));
  }

  public static int power(int base, int n) {
    if (n < 1) {
      return 1;
    } else {
      return base * power(base, --n);
    }
  }
}
