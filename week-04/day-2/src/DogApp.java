/**
 * Created by peter on 2017.04.04..
 */
public class DogApp {

  public static void main(String[] args) {

    Puli puli = new Puli("dezso");
    Dog orherPuli = new Puli("muffin");

    // Polymorphism #1: an Object can act differently
    puli.herdSheep();

    // otherPuli.herdSheep(); --> error here, I can't reach method of Puli this way

    // Polymorphism #2: different Objects can act the same way
  }
}