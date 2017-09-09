package charsequence;

public class CharOperations implements CharSequence {

  public int length() {
    return 0;
  }

  public char charAt(int index) {
    return 1;
  }

  public CharSequence subSequence(int start, int end) {
    return null;
  }

  public static void main(String[] args) {
    CharOperations myCharOp = new CharOperations();
    System.out.println(myCharOp.length());
    System.out.println(myCharOp.charAt(6));
    System.out.println(myCharOp.subSequence(1, 4));
  }
}
