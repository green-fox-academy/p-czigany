import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

class CountLettersTest {

  @Test
  void testCaseOne() {
    CountLetters myCounter = new CountLetters();
    HashMap<Character, Integer> compareTo = new HashMap<>();
    compareTo.put('a', 4);
    compareTo.put('y', 1);
    compareTo.put('k', 1);
    compareTo.put('r', 1);
    compareTo.put('s', 1);
    compareTo.put('n', 1);
    assertEquals(compareTo, myCounter.countLetters("saarkaany"));
  }

  @Test
  void testCaseFalse() {
    CountLetters myCounter = new CountLetters();
    HashMap<Character, Integer> compareTo = new HashMap<>();
    compareTo.put('a', 4);
    compareTo.put('y', 1);
    compareTo.put('k', 1);
    compareTo.put('r', 1);
    compareTo.put('s', 1);
    compareTo.put('n', 1);
    assertFalse(compareTo.equals(myCounter.countLetters("saaarkaaany")));
  }

  @Test
  void testCaseNull() {
    CountLetters myCounter = new CountLetters();
    HashMap<Character, Integer> compareTo = new HashMap<>();
    assertTrue(compareTo.equals(myCounter.countLetters(null)));
  }

  @Test
  void testCaseEmpty() {
    CountLetters myCounter = new CountLetters();
    HashMap<Character, Integer> compareTo = new HashMap<>();
    assertTrue(compareTo.equals(myCounter.countLetters("")));
  }
}
