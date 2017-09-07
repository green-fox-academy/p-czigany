import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CounterTest {

  private Counter c = new Counter();

  @Test
  void addMore() {
    c.add(5);
    Assertions.assertEquals(5, c.get());
  }

  @Test
  void addOne() {
    c.add();
    Assertions.assertEquals(1, c.get());
  }

  @Test
  void getZero() {
    Assertions.assertEquals(0, c.get());
  }

  @Test
  void getInit() {
    Counter c = new Counter(7);
    Assertions.assertEquals(7, c.get());
  }

  @Test
  void resetToZero() {
    c.add();
    c.reset();
    Assertions.assertEquals(0, c.get());
  }

  @Test
  void resetToInit() {
    Counter c = new Counter(7);
    c.add(5);
    c.reset();
    Assertions.assertEquals(7, c.get());
  }
}
