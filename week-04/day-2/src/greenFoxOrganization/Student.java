package greenFoxOrganization;

/**
 * Created by peter on 2017.04.04..
 */
public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from "
            + previousOrganization + " who skipped " + skippedDays
            + " days from the course already.");
  }

  void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }
}
