/**
 * Created by peter on 2017.04.04..
 */
public class PetRock {

  private String name;
  private boolean happy = false;

  public PetRock(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean isHappy() {
    return happy;
  }

  public void playWithRock() {
    happy = true;
  }
}
