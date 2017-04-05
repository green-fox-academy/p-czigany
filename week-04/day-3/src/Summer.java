import java.util.ArrayList;

/**
 * Created by peter on 2017.04.05..
 */
public class Summer {

  int sum(ArrayList<Integer> toSum) {
    int sum = 0;
    for (Integer current :
            toSum) {
      sum += current;
    }
    return sum;
  }
}
