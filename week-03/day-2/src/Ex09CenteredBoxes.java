import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex09CenteredBoxes {

  public static void mainDraw(Graphics graphics) {
    centerBox(10, graphics);
    centerBox(130, graphics);
    centerBox(190, graphics);
  }

  public static void centerBox(int a, Graphics g) {
    g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
            (int) (Math.random() * 256), (int) (Math.random() * 256)));
    g.fillRect(150 - (a / 2), 150 - (a / 2),
            a, a);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
