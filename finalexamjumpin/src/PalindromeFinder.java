class PalindromeFinder {

  boolean isPalindrome(String examinedText) {
    String withoutPunctuationOrSpaces = examinedText.replaceAll("[^a-zA-Z0-9]", "");
    String noPunctuationLowerCase = withoutPunctuationOrSpaces.toLowerCase();
    char[] smallCaseLetters = noPunctuationLowerCase.toCharArray();
    for (int i = 0; i < smallCaseLetters.length; i++) {
      if (smallCaseLetters[i] != smallCaseLetters[smallCaseLetters.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}
