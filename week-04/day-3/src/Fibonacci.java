class Fibonacci {

  int fibonacci(int nth) {
    if (nth == 1) {
      return 0;
    } else if (nth == 2) {
      return 1;
    } else {
      return fibonacci(nth - 1) + fibonacci(nth - 2);
    }
  }
}
