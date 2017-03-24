import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by peter on 2017.03.24..
 */
public class Ex01Anagram {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(
            "Please tell me the two lines of which I will tell you if they contain the same letters:");
    String forwardsString = scan.nextLine();
    String backwardsString = scan.nextLine();
    ArrayList<Character> forwardsLetters = stringToLetters(forwardsString);
    ArrayList<Character> backwardsLetters = stringToLetters(backwardsString);
    if (forwardsLetters.containsAll(backwardsLetters) && backwardsLetters
            .containsAll(forwardsLetters)) {
      System.out.println("Anagrams they are!");
    } else {
      System.out.println("They are not anagrams.");
    }

  }

  public static ArrayList<Character> stringToLetters(String toConvert) {
    toConvert = toConvert.replaceAll("[^a-zA-Z]", "").toLowerCase();
    ArrayList<Character> converted = new ArrayList<>();
    for (int i = 0; i < toConvert.length(); i++) {
      converted.add(toConvert.charAt(i));
    }
    return converted;

  }

}
