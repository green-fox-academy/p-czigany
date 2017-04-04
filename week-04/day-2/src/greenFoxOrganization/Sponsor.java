package greenFoxOrganization;

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
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }

  Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }
}
