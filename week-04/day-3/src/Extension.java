import java.util.Arrays;
import java.util.List;

/**
 * Created by peter on 2017.04.05..
 */
public class Extension {

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        return a;
      } else {
        return c;
      }
    } else {
      if (b > c) {
        return b;
      } else {
        return c;
      }
    }
  }

  double median(List<Integer> pool) {
    pool = bubbleSortList(pool);
    if (pool.size() % 2 != 0) {
      return pool.get((pool.size() - 1) / 2);
    } else {
      return ((double) pool.get(pool.size() / 2) + (double) pool.get((pool.size() - 2) / 2)) / 2;
    }
  }

  List<Integer> bubbleSortList(List<Integer> toSort) {
    boolean flag = true;
    int swap;
    while (flag) {
      flag = false;
      for (int j = 0; j < toSort.size() - 1; j++) {
        if (toSort.get(j) < toSort.get(j + 1)) {
          swap = toSort.get(j);
          toSort.set(j, toSort.get(j + 1));
          toSort.set(j + 1, swap);
          flag = true;
        }
      }
    }
    return toSort;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'á', 'u', 'ú', 'ü', 'ű', 'o', 'ó', 'ö', 'ő', 'e', 'é', 'i', 'í')
            .contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = teve.substring(0, i + 1) + "v" + teve.substring(i);
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}
