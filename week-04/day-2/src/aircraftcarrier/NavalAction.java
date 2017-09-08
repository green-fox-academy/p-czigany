package aircraftcarrier;

public class NavalAction {

  public static void main(String[] args) {
    Carrier joska = new Carrier(30);
    Carrier pista = new Carrier(550);
    for (int i = 0; i < 4; i++) {
      joska.addAircraft("F16");
      pista.addAircraft("F35");
    }
    for (int i = 0; i < 6; i++) {
      pista.addAircraft("F16");
      joska.addAircraft("F35");
    }
    System.out.println(joska.getStatus());
    System.out.println(pista.getStatus());
    joska.fill();
    pista.fill();
    System.out.println(joska.getStatus());
    System.out.println(pista.getStatus());
    joska.fight(pista);
    System.out.println(joska.getStatus());
    System.out.println(pista.getStatus());
    System.out.println(pista.getHealthPoints());
  }
}
