import java.util.Scanner;

/**
 * Created by peter on 2017.03.24..
 */
public class Ex29DrawDiamond {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();

    int greaterHalf;
    if (h % 2 == 0) {
      greaterHalf = h / 2;
    } else {
      greaterHalf = (h + 1) / 2;
    }

    printTriangle(greaterHalf);
    printInverseTriangle(h, greaterHalf);
  }

  public static void printTriangle(int greaterHalf) {
    for (int i = 0; i < greaterHalf; i++) {
      printRow(i, greaterHalf);
    }
  }

  public static void printInverseTriangle(int height, int greaterHalf) {
    for (int i = (height - greaterHalf) - 1; i > -1; i--) {
      printRow(i, greaterHalf);
    }
  }

  public static void printRow(int i, int greaterHalf) {
    for (int j = 0; j < (greaterHalf - i); j++) {
      System.out.print(" ");
    }
    System.out.print("*");
    for (int j = 0; j < i; j++) {
      System.out.print("**");
    }
    System.out.print("\n");
  }
}
