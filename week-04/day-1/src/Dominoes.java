import java.util.ArrayList;

import java.util.List;

/**
 * Created by peter on 2017.04.03..
 */
public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    dominoes = dominoSnake(dominoes);
    System.out.println(dominoes);
  }

  public static List<Domino> dominoSnake (List<Domino> toArrange) {
    for (int i = 0; i < toArrange.size(); i++) {
      for (int j = i + 2; j < toArrange.size(); j++) {
        if (toArrange.get(j).getValues()[0] == toArrange.get(i).getValues()[1]) {
          Domino swap = toArrange.get(j);
          toArrange.remove(toArrange.get(j));
          toArrange.add(i + 1, swap);
        }
      }
    }
    return toArrange;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
