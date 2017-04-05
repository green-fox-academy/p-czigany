import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.05..
 */
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
}
