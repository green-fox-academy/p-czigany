package greenfoxorganization;

/**
 * Created by peter on 2017.04.04..
 */
public class Mentor extends Person {

  String level;

  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

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
}
