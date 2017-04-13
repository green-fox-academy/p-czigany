import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex18OddEven {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numberToJudge = scan.nextInt();
    if (numberToJudge % 2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
  }
}
