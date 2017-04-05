import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.05..
 */
class AnagramTest {

  @Test
  void anagramTestCase() {
    Anagram annah = new Anagram();
    assertTrue(annah.areAnagrams("kacsa", "sacka"));
  }
}
