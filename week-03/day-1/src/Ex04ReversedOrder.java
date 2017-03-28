import static java.nio.file.Files.readAllLines;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.03.27..
 */
public class Ex04ReversedOrder {

  public static void main(String[] args) {
    reverseLinesToFile();
  }

  public static void reverseLinesToFile() {
    List<String> linesFrom = readFromFile(Paths.get("assets/reversed-order.txt"));
    List<String> linesTo = reverseLineOrder(linesFrom);
    printToFile(Paths.get("assets/right-order.txt"), linesTo);
  }

  public static List<String> readFromFile(Path fileLocation) {
    try {
      return readAllLines(fileLocation);
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to read from file.");
      return null;
    }
  }

  public static List<String> reverseLineOrder(List<String> toReverseOrder) {
    List<String> reverseOrderedLines = new ArrayList<>();
    for (int i = toReverseOrder.size(); i > 0; i--) {
      reverseOrderedLines.add(toReverseOrder.get(i - 1));
    }
    return reverseOrderedLines;
  }

  public static void printToFile(Path filePath, List<String> toPrint) {
    try {
      Files.write(filePath, toPrint, Charset.forName("UTF-8"));
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to write to a file.");
    }
  }
}
