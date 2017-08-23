import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex21SuperHexagon {

  private static final double HEIGHT_FACTOR = Math.sqrt(3) / 2;

  public static void mainDraw(Graphics graphics) {
    double side = 30;
    int x1 = 200;
    int y1 = 200;

    biggerHexagon(4, side, x1, y1, graphics);
  }

  private static void biggerHexagon(int size, double side, int xOffset, int yOffset, Graphics g) {

    double[][] vectors = {
        {(-1) * 1.5 * side, (-1) * HEIGHT_FACTOR * side},
        {0, (-2) * HEIGHT_FACTOR * side},
        {1.5 * side, (-1) * HEIGHT_FACTOR * side},
        {1.5 * side, HEIGHT_FACTOR * side},
        {0, 2 * HEIGHT_FACTOR * side},
        {(-1) * 1.5 * side, HEIGHT_FACTOR * side},
    };

    smallHexagon(side, xOffset, yOffset, g);

    double xStart = xOffset;
    double yStart = yOffset;

    for (int radius = 1; radius < size; radius++) {
      for (int i = 0; i < 7; i++) {
        int steps;
        switch (i) {
          case 0:
            steps = 1;
            break;
          case 1:
            steps = radius - 1;
            break;
          default:
            steps = radius;
            break;
        }
        for (int j = 0; j < steps; j++) {
          xStart += vectors[(i + 2) % 6][0];
          yStart += vectors[(i + 2) % 6][1];
          smallHexagon(side, xStart, yStart, g);
        }
      }
    }
  }

  private static void smallHexagon(double side, double xOffset, double yOffset, Graphics g) {
    int[] xCoords = {(int) xOffset, (int) (xOffset + side / 2), (int) (xOffset + side * 3 / 2),
        (int) (xOffset + side * 2), (int) (xOffset + side * 3 / 2), (int) (xOffset + side / 2)};
    int[] yCoords = {(int) yOffset, (int) (yOffset + side * HEIGHT_FACTOR),
        (int) (yOffset + side * HEIGHT_FACTOR), (int) yOffset,
        (int) (yOffset - side * HEIGHT_FACTOR), (int) (yOffset - side * HEIGHT_FACTOR)};
    g.drawPolygon(xCoords, yCoords, 6);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(500, 500));
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
