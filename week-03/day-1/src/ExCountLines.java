import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExCountLines {

  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.

  public static void main(String[] args) {
    System.out.println(countLinesOfFile("assets/my-file.txt"));
    System.out.println(countLinesOfFile("assets/otos.csv"));
    System.out.println(countLinesOfFile("assets/not-my-file.txt"));
  }

  private static int countLinesOfFile(String stringPath) {
    try {
      Path filePath = Paths.get(stringPath);
      List<String> lines = Files.readAllLines(filePath);
      return lines.size();
    } catch (IOException ex) {
      return 0;
    }
  }
}
