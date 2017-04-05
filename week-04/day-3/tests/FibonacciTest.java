import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.05..
 */
class FibonacciTest {

  @Test
  void testCaseOne() {
    Fibonacci myFibo = new Fibonacci();
    assertEquals(5, myFibo.fibonacci(6));
  }
}
