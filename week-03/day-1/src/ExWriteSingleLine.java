import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExWriteSingleLine {

  // Open a file called "my-file.txt"
  // Write your name in it as a single line
  // If the program is unable to write the file,
  // then it should print an error message like: "Unable to write file: my-file.txt"

  private static final String MY_NAME = "Péter Czigány";

  public static void main(String[] args) {
    writeMyNameInFile("assets/my-name.txt");
  }

  private static void writeMyNameInFile(String stringPath) {
    List<String> content = new ArrayList<>();
    content.add(MY_NAME);
    try {
      Path filePath = Paths.get(stringPath);
      Files.write(filePath, content);
    } catch (IOException ex) {
      System.out.println("Unable to write file: " + stringPath);
      System.out.println(Arrays.toString(ex.getStackTrace()));
    }
  }
}
