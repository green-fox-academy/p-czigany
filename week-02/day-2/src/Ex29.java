/**
 * Created by peter on 2017.03.21..
 */

import java.util.Scanner;

public class Ex29 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    boolean notEven = true;
    if (h % 2 == 0) {
      notEven = false;
    }
    int greaterHalf;
    if (notEven) {
      greaterHalf = (h + 1) / 2;
    } else {
      greaterHalf = h / 2;
    }
    for (int i = 0; i < greaterHalf; i++) {
      for (int j = 0; j < (greaterHalf - i); j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 0; j < i; j++) {
        System.out.print("**");
      }
      System.out.print("\n");
    }
    for (int i = (h - greaterHalf) - 1; i > -1; i--) {
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
}
