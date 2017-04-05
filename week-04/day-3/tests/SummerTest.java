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

  @Test
  void testCaseEmptyList() {
    Summer myShortestSummer = new Summer();
    ArrayList<Integer> myListOfNumbers = new ArrayList<>();
    assertEquals(0, myShortestSummer.sum(myListOfNumbers));
  }

  @Test
  void testCaseOneElement() {
    Summer myShortestSummer = new Summer();
    ArrayList<Integer> myListOfNumbers = new ArrayList<>();
    myListOfNumbers.add(3);
    assertEquals(3, myShortestSummer.sum(myListOfNumbers));
  }

  @Test
  void testCaseMultipleElements() {
    Summer myShortestSummer = new Summer();
    ArrayList<Integer> myListOfNumbers = new ArrayList<>();
    myListOfNumbers.add(5);
    myListOfNumbers.add(10);
    myListOfNumbers.add(5);
    myListOfNumbers.add(7);
    assertEquals(27, myShortestSummer.sum(myListOfNumbers));
  }

  @Test
  void testCaseNull() {
    Summer myShortestSummer = new Summer();
    assertEquals(0, myShortestSummer.sum(null));
  }
}
