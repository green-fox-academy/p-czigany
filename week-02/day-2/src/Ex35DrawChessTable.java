/**
 * Created by peter on 2017.03.21..
 */
public class Ex35DrawChessTable {

  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
        if ((j + 1) % 8 == 0) {
          System.out.print("\n");
        }
      }
    }
  }
}
