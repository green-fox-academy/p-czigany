import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.05..
 */
class SharpieTest {

  @Test
  void inkTest() {
    Sharpie mySharpestSharpie = new Sharpie("yellow", 2.0f);
    for (int i = 0; i < 100; i++) {
      mySharpestSharpie.use();
    }
    assertFalse(mySharpestSharpie.isUsable());
  }
}