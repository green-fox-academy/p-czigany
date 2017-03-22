/**
 * Created by peter on 2017.03.21..
 */
public class Ex11 {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    System.out.println(24 * 3600 - (currentHours * 3600 + currentMinutes * 60 + currentSeconds)
            + " seconds remaining from the day.");
  }
}
