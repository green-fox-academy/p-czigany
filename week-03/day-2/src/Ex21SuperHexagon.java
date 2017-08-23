import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex21SuperHexagon {

  private static final double HEIGHT_FACTOR = 0.866025;

  public static void mainDraw(Graphics graphics) {
    double side = 30;
    int x1 = 120;
    int y1 = 150;

    biggerHexagon(side, x1, y1, graphics);
  }

  private static void biggerHexagon(double side, int xOffset, int yOffset, Graphics g) {

    double[][] vectors = {
        {(-1) * 1.5 * side, (-1) * HEIGHT_FACTOR * side},
        {0, (-2) * HEIGHT_FACTOR * side},
        {1.5 * side, (-1) * HEIGHT_FACTOR * side},
        {1.5 * side, HEIGHT_FACTOR * side},
        {0, 2 * HEIGHT_FACTOR * side},
        {(-1) * 1.5 * side, HEIGHT_FACTOR * side},
    };

    smallHexagon(side, xOffset, yOffset, g);
    for (int i = 0; i < 6; i++) {
      smallHexagon(side, xOffset + (int) vectors[i][0], yOffset + (int) vectors[i][1], g);
    }
  }

  private static void smallHexagon(double side, int xOffset, int yOffset, Graphics g) {
    int[] xCoords = {xOffset, (int) (xOffset + side / 2), (int) (xOffset + side * 3 / 2),
        (int) (xOffset + side * 2), (int) (xOffset + side * 3 / 2), (int) (xOffset + side / 2)};
    int[] yCoords = {yOffset, (int) (yOffset + side * HEIGHT_FACTOR),
        (int) (yOffset + side * HEIGHT_FACTOR), yOffset,
        (int) (yOffset - side * HEIGHT_FACTOR), (int) (yOffset - side * HEIGHT_FACTOR)};
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
