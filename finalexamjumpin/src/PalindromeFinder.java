class PalindromeFinder {

  boolean isPalindrome(String examinedText) {
    String withoutPunctuationOrSpaces = examinedText.replaceAll("[^a-zA-Z0-9]", "");
    String noPunctuationLowerCase = withoutPunctuationOrSpaces.toLowerCase();
    char[] smallCaseLetters = noPunctuationLowerCase.toCharArray();
    int characters = smallCaseLetters.length;
    int compareUpTo = (characters % 2 == 0) ? characters / 2 : (characters + 1) /2;
    for (int i = 0; i < compareUpTo; i++) {
      if (smallCaseLetters[i] != smallCaseLetters[characters - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}
