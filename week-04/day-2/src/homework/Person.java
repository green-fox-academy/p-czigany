package homework;

class Person {

  static final String MY_GOAL = "My goal is: ";
  String name;
  int age;
  String gender;

  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  void getGoal() {
    System.out.println(MY_GOAL + "Live for the moment!");
  }

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    this("Jane Doe", 30, "female");
  }
}
