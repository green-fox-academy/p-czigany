/**
 * Created by peter on 2017.03.21..
 */

import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter two numbers!");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    if (num1 > num2) {
      System.out.println(num1);
    } else if (num2 > num1) {
      System.out.println(num2);
    }
  }
}
