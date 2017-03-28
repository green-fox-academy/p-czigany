import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex14EverythingGoesToCenter {

  public static void mainDraw(Graphics graphics) {
    int startOffset = 20;
    int i;
    for (i = 0; i <= 300 / startOffset; i++) {
      lineToCenter(i * startOffset, 0, graphics);
      lineToCenter(300, i * startOffset, graphics);
      lineToCenter(i * startOffset, 300, graphics);
      lineToCenter(0, i * startOffset, graphics);
    }
  }

  public static void lineToCenter(int x, int y, Graphics g) {
    g.drawLine(x, y, 150, 150);
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
