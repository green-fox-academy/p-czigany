/**
 * Created by peter on 2017.03.21..
 */

import  java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numberToJudge = scan.nextInt();
    if (numberToJudge <= 0) {
      System.out.println("Not enough");
    } else if (numberToJudge == 1) {
      System.out.println("One");
    } else if (numberToJudge == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }
  }
}