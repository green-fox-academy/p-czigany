/**
 * Created by peter on 2017.03.21..
 */

public class Ex22 {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    if (a % 2 == 2) {
      out++;
    }
    System.out.println(out);
    int b = 13;
    String out2 = "";
    if (b < 20 && b > 10) {
      out2 = "Sweet!";
    }
    if (b < 10) {
      out2 = "More!";
    }
    if (b > 20) {
      out2 = "Less!";
    }
    System.out.println(out2);
    int c = 123;
    int credits = 100;
    boolean isBonus = false;
    if (isBonus == false) {
      if (credits >= 50) {
        c -= 2;
      }
      else {
        c--;
      }
    }
    System.out.println(c);
    int d = 8;
    int time = 120;
    String out3 = "";
    if (d % 4 == 0) {
      if (time <= 200) {
        out3 = "check";
      } else {
        out3 = "Time out";
      }
    }
    else {
      out3 = "Run Forest Run!";
    }
    System.out.println(out3);
  }
}
