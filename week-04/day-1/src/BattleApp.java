public class BattleApp {

  public static void main(String[] args) {
    Ship yamato = new Ship();
    Ship kingGeorgeVI = new Ship();
    yamato.fillShip();
    kingGeorgeVI.fillShip();
    yamato.status();
    kingGeorgeVI.status();
    yamato.battle(kingGeorgeVI);
    yamato.status();
    kingGeorgeVI.status();
  }
}
