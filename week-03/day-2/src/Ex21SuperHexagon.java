import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex21SuperHexagon {

  public static void mainDraw(Graphics graphics) {
    double size = 30;
    int x1 = 30;
    int y1 = 250;
    smallHexagon(size, x1, y1, graphics);
  }

  public static void smallHexagon(double size, int xOffset, int yOffset, Graphics g) {
    double h = 0.866025;
    int[] xCoords = {xOffset, (int) (xOffset + size / 2), (int) (xOffset + size * 3 / 2),
            (int) (xOffset + size * 2), (int) (xOffset + size * 3 / 2), (int) (xOffset + size / 2)};
    int[] yCoords = {yOffset, (int) (yOffset + size * h), (int) (yOffset + size * h), yOffset, (int) (yOffset - size * h), (int) (yOffset - size * h)};
    g.drawPolygon(xCoords, yCoords, 6);
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
