package calculator;

class Calculator {

  <T extends Number> double add(T addTo, T toAdd) {
    return addTo.doubleValue() + toAdd.doubleValue();
  }

  <T extends Number> double subtract(T subtractFrom, T decreaseBy) {
    return subtractFrom.doubleValue() - decreaseBy.doubleValue();
  }

  <T extends Number> double multiply(T toMultiply, T multiplyBy) {
    return toMultiply.doubleValue() * multiplyBy.doubleValue();
  }

  <T extends Number> double divide(T toDivide, T divideBy) {
    if (!divideBy.equals(0)) {
      return toDivide.doubleValue() / divideBy.doubleValue();
    } else {
      System.out.println("Division by zero.");
      return 0;
    }
  }
}
