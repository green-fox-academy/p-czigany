/**
 * Created by peter on 2017.03.30..
 */
public class Ex05Bunnies {
  
  public static void main(String[] args) {
    System.out.println(bunnyEarCounter(6));
  }

  public static int bunnyEarCounter(int bunnies) {
    if (bunnies < 1) {
      return 0;
    } else {
      return 2 + bunnyEarCounter(--bunnies);
    }
  }
}
