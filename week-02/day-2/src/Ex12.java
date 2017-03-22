/**
 * Created by peter on 2017.03.21..
 */
public class Ex12 {
  public static void main(String[] args) {
    int a = 123;
    int b = 526;
    int c = a;
    a = b;
    b = c;
    System.out.println(a);
    System.out.println(b);
  }
}
