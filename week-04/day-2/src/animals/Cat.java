package animals;

public class Cat extends Animal {

  private String favToy = "Yarn";

  public void playWith() {
    System.out.println("Yeah " + favToy);
  }

  @Override
  public void walkAround() {
    System.out.println(this.getName() + " stalks around");
  }

  public Cat() {
  }

  public Cat(String name, String favFood, String favToy) {
    super(name, favFood);
    this.favToy = favToy;
  }
}
