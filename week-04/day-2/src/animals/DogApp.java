package animals;

public class DogApp {

  public static void main(String[] args) {

    Puli puli = new Puli("dezso");
    Dog otherPuli = new Puli("muffin");

    // Polymorphism #1: an Object can act differently
    puli.herdSheep();

    // otherPuli.herdSheep(); --> error here, I can't reach method of animals.Puli this way

    // Polymorphism #2: different Objects can act the same way
  }
}