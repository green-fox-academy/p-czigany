/**
 * Created by peter on 2017.03.21..
 */

import java.util.Scanner;

public class Ex34 {
  public static void main(String[] args) {
    System.out.println("How many numbers do you want to type?");
    Scanner scan = new Scanner(System.in);
    int numNum = scan.nextInt();
    int sum = 0;
    for (int i = 0; i < numNum; i++) {
      System.out.println("Gimme an integer value:");
      sum += scan.nextInt();
    }
    System.out.println("Sum: " + sum + ", Average: " + (sum / (float) numNum));
  }
}