/**
 * Created by peter on 2017.03.22..
 */
public class Ex13 {

  public static void main(String[] args) {
    int a = 4;
    int[][] matrix = new int[a][a];

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        if (i == j) {
          matrix[i][j] = 1;
        } else {
          matrix[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
        if ((j + 1) % a == 0) {
          System.out.print("\n");
        } else {
          System.out.print(" ");
        }
      }
    }
  }

}