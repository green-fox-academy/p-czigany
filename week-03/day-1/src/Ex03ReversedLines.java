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
public class Ex03ReversedLines {

  public static void main(String[] args) {
    reverseLinesToFile();
  }

  private static void reverseLinesToFile() {
    List<String> linesFrom = readFromFile(Paths.get("assets/reversed-lines.txt"));
    List<String> linesTo = reverseLines(linesFrom);
    printToFile(Paths.get("assets/forwards-lines.txt"), linesTo);
  }

  private static List<String> readFromFile(Path fileLocation) {
    try {
      return readAllLines(fileLocation);
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to read from file.");
      return new ArrayList<>();
    }
  }

  private static List<String> reverseLines(List<String> toReverse) {
    List<String> reversedLines = new ArrayList<>();
    for (String line :
            toReverse) {
      StringBuilder oneLineTo = new StringBuilder();
      for (int i = line.length(); i > 0; i--) {
        oneLineTo.append(line.charAt(i - 1));
      }
      reversedLines.add(oneLineTo.toString());
    }
    return reversedLines;
  }

  private static void printToFile(Path filePath, List<String> toPrint) {
    try {
      Files.write(filePath, toPrint, Charset.forName("UTF-8"));
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to write to a file.");
    }
  }
}
