import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class AnimalTest {

  private Animal myAnimal = new Animal();

  @Test
  void changeName() {
    myAnimal.changeName("Dogmeat");
    assertEquals("Dogmeat", myAnimal.getName());
  }

  @Test
  void changeNameNull() {
    myAnimal.changeName(null);
    assertEquals(null, myAnimal.getName());
  }

  @Test
  void changeNameEmpty() {
    myAnimal.changeName("");
    assertEquals("", myAnimal.getName());
  }

  @Test
  void getName() {
    assertEquals("animals.Animal", myAnimal.getName());
  }

  @Test
  void eatStuff() {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    myAnimal.eatStuff();
    assertEquals("Yum Food\n", outContent.toString());
    System.setOut(null);
  }

  @Test
  void walkAround() {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    myAnimal.walkAround();
    assertEquals("animals.Animal walks around\n", outContent.toString());
    System.setOut(null);
  }
}
