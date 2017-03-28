import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex04 {

  public static void mainDraw(Graphics graphics) {
    lineToCenter(10, 20, graphics);
    lineToCenter(0, 20, graphics);
    lineToCenter(20, 20, graphics);
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
