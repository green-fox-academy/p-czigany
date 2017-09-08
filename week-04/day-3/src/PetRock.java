class PetRock {

  private String name;
  private boolean happy = false;

  PetRock(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  boolean isHappy() {
    return happy;
  }

  void playWithRock() {
    happy = true;
  }
}
