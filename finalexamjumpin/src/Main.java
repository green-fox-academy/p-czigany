import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toExamine = scanner.nextLine();
        if (new PalindromeFinder().isPalindrome(toExamine)) {
            System.out.println("YES, that's a palindrome!");
        } else {
            System.out.println("NO, that's not a palindrome!");
        }
    }
}
