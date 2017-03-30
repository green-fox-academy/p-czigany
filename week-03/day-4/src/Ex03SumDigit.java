/**
 * Created by peter on 2017.03.30..
 */
public class Ex03SumDigit {
  // Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

  public static void main(String[] args) {
    breakToDigits(136);
  }

  public static void breakToDigits(int numberToBreak) {
    if (numberToBreak < 10) {
      System.out.println(numberToBreak);
      return;
    } else {
      System.out.println(numberToBreak % 10);
      breakToDigits(numberToBreak / 10);
    }
  }
}
