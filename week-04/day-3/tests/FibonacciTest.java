import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void testCaseOne() {
    Fibonacci myFibo = new Fibonacci();
    assertEquals(5, myFibo.fibonacci(6));
  }
}
