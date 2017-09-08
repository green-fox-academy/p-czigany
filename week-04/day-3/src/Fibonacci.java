class Fibonacci {

  int fibonacci(int nth) {
    if (nth < 1) {
      return -1;
    }
    switch (nth) {
      case 1:
        return 0;
      case 2:
        return 1;
      default:
        return fibonacci(nth - 1) + fibonacci(nth - 2);
    }
  }
}
