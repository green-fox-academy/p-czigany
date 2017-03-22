/**
 * Created by peter on 2017.03.22..
 */
public class Ex05 {

  public static void main(String[] args) {

  }

  public static int factorio(int toFactorial) {
    int total = 0;
    for (int i = 0; i < toFactorial; i++) {
      total *= i;
    }
    return total;
  }
}