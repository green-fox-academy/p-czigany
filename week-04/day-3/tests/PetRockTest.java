import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by peter on 2017.04.04..
 */
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
  public void testHappyAfterPlay() throws Exception {
    rocky.playWithRock();
    assertTrue(rocky.isHappy());
  }
}