import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppleTest {

  @Test
  void someTest() {
    Apple myObject = new Apple();
    assertEquals("apple", myObject.getApple());
  }
}
