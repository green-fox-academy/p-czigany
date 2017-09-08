import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

  @Test
  void anagramTestCase() {
    Anagram annah = new Anagram();
    assertTrue(annah.areAnagrams("kacsa", "sacka"));
  }

  @Test
  void anagramTestCaseFalse() {
    Anagram annah = new Anagram();
    assertFalse(annah.areAnagrams("kacsa", "zacsko"));
  }

  @Test
  void anagramTestCaseCaps() {
    Anagram annah = new Anagram();
    assertFalse(annah.areAnagrams("kacsa", "Kacsa"));
  }
}
