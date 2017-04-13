import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex26MultiplicationTable {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    for (int i = 1; i < 10; i++) {
      System.out.println(i + " * " + number + " = " + (i * number));
    }
  }
}
