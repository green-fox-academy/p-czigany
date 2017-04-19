package calculator;

/**
 * Created by peter on 2017.04.19..
 */
public class Calculator {

  public <T extends Number> double add(T addTo, T toAdd) {
    return addTo.doubleValue() + toAdd.doubleValue();
  }

  public <T extends Number> double subtract(T subtractFrom, T decreaseBy) {
    return subtractFrom.doubleValue() - decreaseBy.doubleValue();
  }

  public <T extends Number> double multiply(T toMultiply, T multiplyBy) {
    return toMultiply.doubleValue() * multiplyBy.doubleValue();
  }

  public <T extends Number> double divide(T toDivide, T divideBy) {
    if (!divideBy.equals(0)) {
      return toDivide.doubleValue() / divideBy.doubleValue();
    } else {
      System.out.println("Division by zero.");
      return 0;
    }
  }
}
