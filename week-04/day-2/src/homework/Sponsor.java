package homework;

class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  void hire() {
    hiredStudents++;
  }

  @Override
  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company
                    + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  void getGoal() {
    System.out.println(MY_GOAL + "Hire brilliant junior software developers.");
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
