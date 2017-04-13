/**
 * Created by peter on 2017.04.04..
 */
public class Mentor extends Person {

//  Create a Mentor class that has the same fields and methods as the Personclass, and has the following additional
//
//          fields:
//  level: the level of the mentor (junior / intermediate / senior)
//  methods:
//  getGoal(): prints out "Educate brilliant junior software developers."
//  introduce(): "Hi, I'm name, a age year old gender level mentor."
//  The Mentor class has the following constructors:
//
//  Mentor(name, age, gender, level)
//  Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate

  String name;
  int age;
  String gender;

  String level;

  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
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
