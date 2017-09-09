package comparator;

import java.util.ArrayList;
import java.util.List;

public class LagopusClass {

  private String className;
  private List<Student> students;
  private List<Mentor> mentors;

  void addStudent(Student toAdd) {
    students.add(toAdd);
  }

  void addMentor(Mentor toAdd) {
    mentors.add(toAdd);
  }

  void info() {
    System.out.println(
            "Lagopus " + className + " class has " + students.size() + " students and " + mentors
                    .size() + " mentors.");
  }

  public LagopusClass(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }
}
