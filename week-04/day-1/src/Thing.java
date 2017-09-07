public class Thing {
  private String name;
  private boolean completed;

  Thing(String name) {
    this.name = name;
  }

  void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}
