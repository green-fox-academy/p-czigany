import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex14HelloUser {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please specify your name here:");
    String name = scan.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}
