import java.awt.Color;

/**
 * Created by peter on 2017.04.03..
 */
public class PostIt {

  Color backgroundColor;
  String text;
  Color textColor;

  public PostIt(Color backgroundColor, String text, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt first = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    PostIt second = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt third = new PostIt(Color.YELLOW, "Superb!", Color.GREEN);
  }
}
