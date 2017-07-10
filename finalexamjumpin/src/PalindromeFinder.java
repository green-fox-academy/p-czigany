class PalindromeFinder {

  boolean isPalindrome(String examinedText) {

    char[] justLetters = examinedText.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
    for (int i = 0; i < justLetters.length; i++) {
      if (justLetters[i] != justLetters[justLetters.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}
