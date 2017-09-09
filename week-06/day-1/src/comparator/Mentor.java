package comparator;

import java.util.Objects;

class Mentor extends Person implements Comparable<Mentor> {

  private String level;

  @Override
  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  @Override
  void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  Mentor() {
    super("Jane Doe", 30, "female");
    this.level = "intermediate";
  }

  @Override
  public int compareTo(Mentor otherMentor) {
    return Integer.compare(Integer.valueOf(this.level), Integer.valueOf(otherMentor.level));
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Mentor)) {
      return false;
    }
    Mentor otherMentor = (Mentor) o;
    return Objects.equals(this.name, otherMentor.name) &&
        Objects.equals(this.age, otherMentor.age) &&
        Objects.equals(this.gender, otherMentor.gender) &&
        Objects.equals(this.level, otherMentor.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, gender, level);
  }
}
