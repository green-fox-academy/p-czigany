class Animal {

  int hunger;
  private int thirst;

  Animal() {
    hunger = 50;
    thirst = 50;
  }

  void eat() {
    hunger--;
  }

  void drink() {
    thirst--;
  }

  void play() {
    hunger++;
    thirst++;
  }
}
