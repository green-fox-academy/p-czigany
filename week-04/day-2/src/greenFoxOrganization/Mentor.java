package greenFoxOrganization;

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
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }
}
