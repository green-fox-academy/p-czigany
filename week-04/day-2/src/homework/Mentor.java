package homework;

class Mentor extends Person {

  private String level;

  @Override
  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  @Override
  void getGoal() {
    System.out.println(MY_GOAL + "Educate brilliant junior software developers.");
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
