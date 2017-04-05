import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by peter on 2017.04.05..
 */
public class CountLetters {

  HashMap<Character, Integer> countLetters(String textToExamine) {
    HashMap<Character, Integer> charsAndNumbers = new HashMap<>();
    for (Character examined :
            stringToLetters(textToExamine)) {
      if (charsAndNumbers.containsKey(examined)) {
        charsAndNumbers.replace(examined, charsAndNumbers.get(examined) + 1);
      } else {
        charsAndNumbers.put(examined, 1);
      }
    }
    return charsAndNumbers;
  }

  ArrayList<Character> stringToLetters(String toConvert) {
    ArrayList<Character> converted = new ArrayList<>();
    for (int i = 0; i < toConvert.length(); i++) {
      converted.add(toConvert.charAt(i));
    }
    return converted;
  }
}
