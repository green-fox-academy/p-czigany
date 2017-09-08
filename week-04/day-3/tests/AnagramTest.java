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

  @Test
  void anagramTestCaseNulls() {
    Anagram annah = new Anagram();
    assertTrue(annah.areAnagrams(null, null));
  }

  @Test
  void anagramTestCaseFirstNull() {
    Anagram annah = new Anagram();
    assertFalse(annah.areAnagrams(null, "kacsa"));
  }

  @Test
  void anagramTestCaseSecondNull() {
    Anagram annah = new Anagram();
    assertFalse(annah.areAnagrams(null, "kacsa"));
  }
}
