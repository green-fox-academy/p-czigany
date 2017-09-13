package sortthearray;

import java.util.Arrays;

public class ArraySorter {

  public <T extends Number> void sortArray(T[] inputArray) {
    int j;
    boolean flag = true;
    T temp;
    while (flag) {
      flag = false;
      try {
        for (j = 0; j < inputArray.length - 1; j++) {
          if (inputArray[j].doubleValue() < inputArray[j + 1].doubleValue()) {
            temp = inputArray[j];
            inputArray[j] = inputArray[j + 1];
            inputArray[j + 1] = temp;
            flag = true;
          }
        }
      } catch (NullPointerException e) {
        System.out.println("Null pointer exception!");
      }
    }
    System.out.println(Arrays.toString(inputArray));
  }
}
