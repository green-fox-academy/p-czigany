package sumthearray;

import java.util.Arrays;

/**
 * Created by peter on 2017.04.19..
 */
public class ArraySummer {

  public <T extends Number> double sumArray(T[] inputArray, int l) {
    double sum = 0;
    for (int i = 0; i < l; i++) {
      sum += inputArray[i].doubleValue();
    }
    return sum;
  }
}
