import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PetRockTest {

  private PetRock rocky = new PetRock("Rocky");

  @Test
  void getName() throws Exception {
    assertEquals("Rocky", rocky.getName());
  }

  @Test
  void testUnhappyToStart() throws Exception {
    assertFalse(rocky.isHappy());
  }

  @Test
  void testHappyAfterPlay() throws Exception {
    rocky.playWithRock();
    assertTrue(rocky.isHappy());
  }
}
