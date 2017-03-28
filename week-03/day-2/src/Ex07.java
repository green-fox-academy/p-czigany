import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex07 {

  public static void mainDraw(Graphics graphics) {
    randomRectangles(4, graphics);
  }

  public static void randomRectangles(int n, Graphics g) {

    for (int i = 0; i < n; i++) {
      g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
              (int) (Math.random() * 256), (int) (Math.random() * 256)));
      g.fillRect((int) (Math.random() * 250), (int) (Math.random() * 250),
              1 + (int) (Math.random() * 100), 1 + (int) (Math.random() * 100));
    }
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