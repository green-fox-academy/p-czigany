import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ExCopyFile {

  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful

  public static void main(String[] args) {
    System.out.println(copy("assets/five-apples.txt", "assets/my-name.txt"));
    System.out.println(copy("assets/nonexistent-file.txt", "assets/my-name.txt"));
  }

  private static boolean copy(String sourceFile, String targetFile) {
    try {
      List<String> content = Files.readAllLines(Paths.get(sourceFile));
      Files.write(Paths.get(targetFile), content);
      return true;
    } catch (IOException ex) {
      System.out.println("Some I/O exception occurred.");
      System.out.println(Arrays.toString(ex.getStackTrace()));
      return false;
    }
  }
}
