package comparator;

import java.util.Objects;

class Student extends Person implements Comparable<Student> {

  private String previousOrganization;
  private int skippedDays;

  void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  @Override
  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from "
            + previousOrganization + " who skipped " + skippedDays
            + " days from the course already.");
  }

  @Override
  void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    super("Jane Doe", 30, "female");
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  @Override
  public int compareTo(Student otherStudent) {
    return Integer.compare(this.skippedDays, otherStudent.skippedDays);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Student)) {
      return false;
    }
    Student otherStudent = (Student) o;
    return Objects.equals(this.name, otherStudent.name) &&
        Objects.equals(this.age, otherStudent.age) &&
        Objects.equals(this.gender, otherStudent.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, gender);
  }
}
