import java.util.Arrays;
import java.util.List;

class Extension {

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
    List<Integer> sortedPool = bubbleSortList(pool);
    if (sortedPool.size() % 2 != 0) {
      return sortedPool.get((sortedPool.size() - 1) / 2);
    } else {
      return ((double) sortedPool.get(sortedPool.size() / 2)
          + (double) sortedPool.get((sortedPool.size() - 2) / 2)) / 2;
    }
  }

  private List<Integer> bubbleSortList(List<Integer> toSort) {
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
    StringBuilder teve = new StringBuilder();
    teve.append(hungarian);
    int length = teve.length();
    int i = 0;
    while(i < length) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve.insert(i, c).insert(i + 1, "v");
        i += 3;
        length += 2;
      } else {
        i++;
      }
    }
    return teve.toString();
  }
}
