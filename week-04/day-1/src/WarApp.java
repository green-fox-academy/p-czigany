public class WarApp {

  public static void main(String[] args) {
    Armada myArmada = new Armada();
    Armada yourArmada = new Armada();
    myArmada.fillArmada();
    yourArmada.fillArmada();
    System.out.println(myArmada.war(yourArmada));
  }
}
