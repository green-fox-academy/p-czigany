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
public class Ex05EncodedLines {

  public static void main(String[] args) {
    decodeToFile();
  }

  private static void decodeToFile() {
    List<String> linesFrom = readFromFile(Paths.get("assets/encoded-lines.txt"));
    List<String> linesTo = decode(linesFrom);
    printToFile(Paths.get("assets/decoded-lines.txt"), linesTo);
  }

  private static List<String> readFromFile(Path fileLocation) {
    try {
      return readAllLines(fileLocation);
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to read from file.");
      return new ArrayList<>();
    }
  }

  private static List<String> decode(List<String> toSingle) {
    List<String> singledLines = new ArrayList<>();
    for (String line :
            toSingle) {
      char[] charLine = line.toCharArray();
      for (int i = 0; i < charLine.length; i++) {
        if (charLine[i] != ' ') {
          charLine[i] -= 1;
        }
      }
      String oneLineTo = String.valueOf(charLine);
      singledLines.add(oneLineTo);
    }
    return singledLines;
  }

  private static void printToFile(Path filePath, List<String> toPrint) {
    try {
      Files.write(filePath, toPrint, Charset.forName("UTF-8"));
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to write to a file.");
    }
  }
}
