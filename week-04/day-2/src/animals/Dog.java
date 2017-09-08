package animals;

public class Dog {

  String name;

  public Dog(String name) {
    this.name = name;
    System.out.println("A dog has been created.");
  }

  Dog() {
    this.name = "dog";
    System.out.println("A dog has been created.");
  }
}
