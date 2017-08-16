import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by peter on 2017.03.27..
 */
public class Ex01Lotto {

  public static void main(String[] args) {
    topFiveNumbers();
  }

  private static void topFiveNumbers() {
    try {
      Path filePath = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(filePath);
      printTopFive
              (bubbleSort
                      (toSequenceList
                              (numbersFromLines
                                      (lines))));
    } catch (IOException ex) {
      System.out.println("I/O Error occurred.");
    } catch (Exception ex) {
      System.out.println("Error occurred. " + Arrays.toString(ex.getStackTrace()));
    }
  }

  private static ArrayList<Integer> numbersFromLines(List<String> toSplit) {
    ArrayList<Integer> occurringNumbers = new ArrayList<>();
    for (String oneLine :
            toSplit) {
      String[] slicedLine = oneLine.split(";");

      for (int i = slicedLine.length - 5; i < slicedLine.length; i++) {
        occurringNumbers.add(Integer.valueOf(slicedLine[i]));
      }
    }
    return occurringNumbers;
  }

  private static int[][] toSequenceList(ArrayList<Integer> inputList) {
    int[][] sequence = new int[90][2];
    for (int i = 1; i < 90; i++) {
      sequence[i - 1][0] = i;
      sequence[i - 1][1] = Collections.frequency(inputList, i);
    }
    return sequence;
  }

  private static int[][] bubbleSort(int[][] toSort) {
    for (int i = 0; i < toSort.length; i++) {
      for (int j = i; j < toSort.length; j++) {
        if (toSort[i][1] < toSort[j][1]) {
          int[] swap = toSort[i];
          toSort[i] = toSort[j];
          toSort[j] = swap;
        }
      }
    }
    return toSort;
  }

  private static void printTopFive(int[][] list) {
    for (int i = 0; i < 5; i++) {
      System.out.println("The " + (i + 1) + ". most frequent lottery number is: " + (list[i][0]));
    }
  }
}
