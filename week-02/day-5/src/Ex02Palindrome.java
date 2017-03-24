import java.util.Scanner;

/**
 * Created by peter on 2017.03.24..
 */
public class Ex02Palindrome {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("I will make a palindrome if you give me a line of text:");
    String forwardsText = scan.nextLine();

    System.out.println(createPalindrome(forwardsText));

  }

  public static String createPalindrome(String startingString) {
    String palindrome = startingString;
    for (int i = startingString.length(); i > 0; i--) {
      palindrome += startingString.charAt(i - 1);
    }
    return palindrome;

  }
}
