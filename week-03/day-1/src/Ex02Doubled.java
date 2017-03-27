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
public class Ex02Doubled {

  public static void main(String[] args) {

    List<String> linesFrom = readFromFile(Paths.get("assets/duplicated-chars.txt"));

    List<String> linesTo = doubleRemove(linesFrom);

    printToFile(Paths.get("assets/single-chars.txt"), linesTo);

  }

  public static List<String> readFromFile(Path fileLocation) {
    try {
      return readAllLines(fileLocation);
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to read from file.");
      return null;
    }
  }

  public static List<String> doubleRemove(List<String> toSingle) {
    List<String> singledLines = new ArrayList<>();
    for (String line :
            toSingle) {
      String oneLineTo = "";
      for (int i = 0; i < line.length(); i += 2) {
        oneLineTo += line.charAt(i);
      }
      singledLines.add(oneLineTo);
    }
    return singledLines;
  }

  public static void printToFile(Path filePath, List<String> toPrint) {
    try {
      Files.write(filePath, toPrint, Charset.forName("UTF-8"));
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to write to a file.");
    }
  }
}
