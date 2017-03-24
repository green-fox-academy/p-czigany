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

    if (isAnagram(forwardsString, backwardsString)) {
      System.out.println("Anagrams they are!");
    } else {
      System.out.println("They are not anagrams.");
    }

  }

  public static boolean isAnagram(String forwards, String backwards) {
    ArrayList<Character> forwardsLetters = stringToLetters(forwards);
    ArrayList<Character> backwardsLetters = stringToLetters(backwards);
    return (forwardsLetters.containsAll(backwardsLetters) && backwardsLetters.containsAll(forwardsLetters));
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
