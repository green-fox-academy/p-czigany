import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex30 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        if (i == 0 || j == 0 || i == a - 1 || j == a - 1) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
        if ((j + 1) == a) {
          System.out.print("\n");
        }
      }
    }
  }
}