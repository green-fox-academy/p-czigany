import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex28DrawPyramid {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < (h - i); j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 0; j < i; j++) {
        System.out.print("**");
      }
      System.out.print("\n");
    }
  }
}
