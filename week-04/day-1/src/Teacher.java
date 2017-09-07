public class Teacher {

  //  teach(student) -> calls the students learn method
  //  answer()
  public void teach(Student whom) {
    whom.learn();
  }
  void answer() {
    System.out.println("Now, that's a stupid question.");
  }
}
