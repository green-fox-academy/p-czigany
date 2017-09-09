import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Created by peter on 2017.04.10..
 */
public class MainLoop {

  int testBoxX = 300;
  int testBoxY = 300;

//  @Override
  public void paint(Graphics graphics) {
    paint(graphics);
//    graphics.fillRect(testBoxX, testBoxY, 100, 100);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    Models image = new Models("assets/boss.png", testBoxX, testBoxY);
    image.draw(graphics);
  }

  public static void main(String[] args) {
    while (true) {
      JFrame frame = new JFrame("RPG Game");
//      Area area = new Area();
//      frame.add(area);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.pack();
      // Here is how you can add a key event listener
      // The board object will be notified when hitting any key
      // with the system calling one of the below 3 methods
//      frame.addKeyListener(board);
      // Notice (at the top) that we can only do this
      // because this Board class (the type of the board object) is also a KeyListener
    }
  }
}
