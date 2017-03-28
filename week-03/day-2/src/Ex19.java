import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex19 {

  public static void mainDraw(Graphics graphics) {
    night(graphics);
    stars(100, 3, graphics);
  }

  public static void night(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, 300, 300);
  }

  public static void stars(int n, int size, Graphics g) {

    for (int i = 0; i < n; i++) {
      int shade = (int) (Math.random() * 256);
      g.setColor(new Color(shade, shade, shade));
      g.fillRect((int) (Math.random() * 296), (int) (Math.random() * 296),
              size, size);
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
