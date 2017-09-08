package animals;

public class Animal {

  private String name = "animals.Animal";
  private String favFood = "Food";

  protected final void changeName(String newName) {
    this.name = newName;
  }

  protected final String getName() {
    return this.name;
  }

  public void eatStuff() {
    System.out.println("Yum " + favFood);
  }

  public void walkAround() {
    System.out.println(this.name + " walks around");

  }

  Animal() {

  }

  Animal(String name, String favFood) {
    this.name = name;
    this.favFood = favFood;
  }
}
