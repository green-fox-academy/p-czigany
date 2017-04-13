/**
 * Created by peter on 2017.03.22..
 */
public class Ex10ChangeElement {

  public static void main(String[] args) {
    int[] s = {1, 2, 3, 8, 5, 6};
    s[linearSearch(s, 8)] = 4;
    System.out.println(s[3]);
  }

  public static int linearSearch(int[] numArray, int key) {
    int nth = -1;
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] == key) {
        nth = i;
      }
    }
    return nth;
  }
}
