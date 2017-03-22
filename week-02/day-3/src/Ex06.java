/**
 * Created by peter on 2017.03.22..
 */
public class Ex06 {

  public static void main(String[] args) {
    printer("el", " ", "kellett ", "ten", "nem");
  }

  public static void printer(String... args) {
    for (String current : args) {
      System.out.print(current);
    }
  }
}
