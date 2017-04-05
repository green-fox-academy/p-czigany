import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.05..
 */
public class AppleTest {

  @Test
  void someTest() {
    Apple myObject = new Apple();
    assertEquals("apple", myObject.getApple());
  }
}
