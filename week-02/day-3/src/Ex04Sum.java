/**
 * Created by peter on 2017.03.22..
 */
public class Ex04Sum {

  public static int sum(int biggestNumberToAdd) {
    int total = 0;
    for (int i = 0; i < biggestNumberToAdd; i++) {
      total += i;
    }
    return total;
  }
}
