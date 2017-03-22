import java.util.Arrays;

/**
 * Created by peter on 2017.03.22..
 */
public class Ex19 {

  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    aj = reverser(aj);
    System.out.println(Arrays.toString(aj));
  }

  public static int[] reverser(int[] toReverse) {
    int j;
    if (toReverse.length % 2 == 0) {
      j = toReverse.length / 2;
    } else {
      j = (toReverse.length - 1) /2;
    }
    for (int i = 0; i < j; i++) {
      int buffer = toReverse[i];
      toReverse[i] = toReverse[toReverse.length - 1 - i];
      toReverse[toReverse.length - 1 - i] = buffer;
    }
    return toReverse;
  }
}
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`