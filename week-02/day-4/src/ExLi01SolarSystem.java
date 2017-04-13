import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi01SolarSystem {

  public static void main(String... args) {
    ArrayList<String> planetList = new ArrayList<String>(
            Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
    planetList.add(4, "Saturn");

    System.out.println(planetList);
  }
}
