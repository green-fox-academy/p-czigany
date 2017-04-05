import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.05..
 */
public class SummerTest {

  @Test
  void testCaseOne() {
    Summer myShortestSummer = new Summer();
    ArrayList<Integer> myListOfNumbers = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      myListOfNumbers.add(i);
    }
    assertEquals(6, myShortestSummer.sum(myListOfNumbers));
  }
}
