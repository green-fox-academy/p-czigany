/**
 * Created by peter on 2017.03.30..
 */
public class Ex02NumberAdder {

  public static void main(String[] args) {
    System.out.println(numberAdder(3));
  }

  public static int numberAdder(int highest) {
    if (highest < 0) {
      return 0;
    } else {
      return highest + numberAdder(--highest);
    }
  }
}
