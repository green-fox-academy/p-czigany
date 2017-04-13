import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex15MileToKmConverter {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How long have you been walking in miles, my dear?");
    int distance = scan.nextInt();
    System.out.println("That is exactly " + (distance * 1.609344) + " kilometers thus far.");
  }
}
