/**
 * Created by peter on 2017.03.21..
 */

import java.util.Scanner;

public class Ex25 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    if (num1 >= num2) {
      System.out.println("The second number should be bigger!");
    }
    else {
      for (int i = num1; i < num2; i++) {
        System.out.println(i);
      }
    }
  }
}
