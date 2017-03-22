/**
 * Created by peter on 2017.03.21..
 */

import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    for (int i = 0; i < h + 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}