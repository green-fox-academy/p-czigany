import java.util.Arrays;

/**
 * Created by peter on 2017.04.03..
 */
public class Dice {

  //    You have a Dice class which has 6 dice
  //    You can roll all of them with roll()
  //    Check the current rolled numbers with getCurrent()
  //    You can reroll with reroll()
  //    Your task is to get where all dice is a 6
  int[] dice = new int[6];

  int[] roll() {
    for (int i = 0; i < dice.length; i++) {
      dice[i] = (int) (Math.random() * 6) + 1;
    }
    return dice;
  }

  int[] getCurrent() {
    return dice;
  }

  int getCurrent(int i) {
    return dice[i];
  }

  void reroll() {
    for (int i = 0; i < dice.length; i++) {
      dice[i] = (int) (Math.random() * 6) + 1;
    }
  }

  void reroll(int k) {
    dice[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();
    while (!Arrays.toString(myDice.getCurrent()).equals("[6, 6, 6, 6, 6, 6]")) {
      myDice.reroll();
    }
    System.out.println(Arrays.toString(myDice.getCurrent()));
  }
}
