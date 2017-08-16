import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class ExPrintEachLine {

  // Write a program that opens a file called "my-file.txt", then prints
  // each of lines form the file.
  // If the program is unable to read the file (for example it does not exists),
  // then it should print an error message like: "Unable to read file: my-file.txt"

  public static void main(String[] args) {
    printFile("assets/my-file.txt");
    printFile("assets/not-my-file.txt");
  }

  private static void printFile(String stringPath) {
    try {
      Path filePath = Paths.get(stringPath);
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException ex) {
      System.out.println("Uh-oh, could not read the file! " + Arrays.toString(ex.getStackTrace()));
    }
  }
}
