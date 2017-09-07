import java.awt.Color;

public class PostIt {

  private Color backgroundColor;
  private String text;
  private Color textColor;

  private PostIt(Color backgroundColor, String text, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    new PostIt(Color.PINK, "Awesome", Color.BLACK);
    new PostIt(Color.YELLOW, "Superb!", Color.GREEN);
  }
}
