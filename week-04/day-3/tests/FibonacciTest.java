import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void testCaseOne() {
    Fibonacci myFibo = new Fibonacci();
    assertEquals(5, myFibo.fibonacci(6));
  }

  @Test
  void testCaseTwo() {
    Fibonacci myFibo = new Fibonacci();
    assertEquals(8, myFibo.fibonacci(7));
  }

  @Test
  void testCaseZero() {
    Fibonacci myFibo = new Fibonacci();
    assertEquals(-1, myFibo.fibonacci(0));
  }

  @Test
  void testCaseNull() {
    Fibonacci myFibo = new Fibonacci();
    assertEquals(-1, myFibo.fibonacci(-3));
  }
}
