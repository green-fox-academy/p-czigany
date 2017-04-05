import java.util.ArrayList;

/**
 * Created by peter on 2017.04.05..
 */
public class Anagram {

  boolean areAnagrams(String firstString, String secondString) {
    {
      ArrayList<Character> firstCharacters = stringToLetters(firstString);
      ArrayList<Character> secondCharacters = stringToLetters(secondString);
      return (firstCharacters.containsAll(secondCharacters) && secondCharacters
              .containsAll(firstCharacters));
    }
  }

  ArrayList<Character> stringToLetters(String toConvert) {
    ArrayList<Character> converted = new ArrayList<>();
    for (int i = 0; i < toConvert.length(); i++) {
      converted.add(toConvert.charAt(i));
    }
    return converted;
  }
}
