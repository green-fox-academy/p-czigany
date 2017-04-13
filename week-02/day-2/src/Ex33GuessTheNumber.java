import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex33GuessTheNumber {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = 8;
    boolean haventFound = true;
    while (haventFound) {
      int guess = scan.nextInt();
      if (guess == number) {
        System.out.println("You found the number: " + number);
        haventFound = false;
      } else if (guess < number) {
        System.out.println("The stored number is higher");
      } else {
        System.out.println("The stored number is lower");
      }
    }
  }
}
