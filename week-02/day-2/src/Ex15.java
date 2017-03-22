/**
 * Created by peter on 2017.03.21..
 */

import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How long have you been walking in kilometers, my dear?");
    int distance = scan.nextInt();
    System.out.println("That is exactly " + (distance * 1000) + " meters thus far.");
  }
}
