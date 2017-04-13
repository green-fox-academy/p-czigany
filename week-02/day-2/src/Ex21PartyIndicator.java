import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex21PartyIndicator {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me two numbers! First of girls, then of boys.");
    byte girls = scan.nextByte();
    byte boys = scan.nextByte();
    if (girls == 0) {
      System.out.println("Sausage party");
    }
    else {
      if (girls + boys > 20) {
        if (girls == boys) {
          System.out.println("The party is exellent!");
        }
        else {
          System.out.println("Quite cool party!");
        }
      }
      else if (girls + boys < 20) {
        System.out.println("Average party");
      }
    }
  }
}
