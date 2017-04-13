package greenfoxorganization;

/**
 * Created by peter on 2017.04.04..
 */
public class Sponsor extends Person {

  String company;
  int hiredStudents;

  void hire() {
    hiredStudents++;
  }

  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company
                    + " and hired " + hiredStudents + " students so far.");
  }

  void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  Sponsor() {
    super("Jane Doe", 30, "female");
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
