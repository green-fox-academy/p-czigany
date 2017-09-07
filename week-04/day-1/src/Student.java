public class Student {

  //  learn()
  //  question(teacher) -> calls the teachers answer method
  void learn() {
    System.out.println("*This student is learning.*");
  }

  public void question(Teacher fromWho) {
    fromWho.answer();
  }
}
