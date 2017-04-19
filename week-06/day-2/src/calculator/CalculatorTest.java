package calculator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.19..
 */
public class CalculatorTest {
  Calculator myAbacus = new Calculator();

  @Test
  public void addTest() {
    assertTrue(myAbacus.add(3,4) == 7);
  }

  @Test
  public void subtractTest() {
   assertTrue(myAbacus.subtract(4, 3) == 1);
  }

  @Test
  public void multiplyTest() {
    assertTrue(myAbacus.multiply(4, 3) == 12);
  }

  @Test
  public void divideTest() {
    assertTrue(myAbacus.divide(3, 4) == .75);
  }
}
