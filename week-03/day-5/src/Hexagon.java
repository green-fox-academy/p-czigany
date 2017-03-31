import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.31..
 */
public class Hexagon {

  public static void mainDraw(Graphics graphics) {
    int centerX = 300;
    int centerY = 300;
    int edge = 200;
    recursiveHexagons(centerX, centerY, edge, graphics);
  }

  private static void recursiveHexagons(int centerX, int centerY, int edge, Graphics graphics) {
    if (edge < 5) {
    } else {
      hexagon(centerX, centerY, edge, graphics);
      int shorter = (int) ((double) edge * 2 / 3 * Math.sin(Math.toRadians(30)));
      int longer = (int) ((double) edge * 2 / 3  * Math.cos(Math.toRadians(30)));
      int twoThirds = (int) ((double) edge * 2 / 3);
      int x1 = centerX + shorter;
      int x2 = centerX + twoThirds;
      int x3 = centerX + shorter;
      int x4 = centerX - shorter;
      int x5 = centerX - twoThirds;
      int x6 = centerX - shorter;
      int y1 = centerY - longer;
      int y2 = centerY;
      int y3 = centerY + longer;
      int y4 = centerY + longer;
      int y5 = centerY;
      int y6 = centerY - longer;
      int oneThird = (int) ((double) edge / 3);
      recursiveHexagons(x1, y1, oneThird, graphics);
      recursiveHexagons(x2, y2, oneThird, graphics);
      recursiveHexagons(x3, y3, oneThird, graphics);
      recursiveHexagons(x4, y4, oneThird, graphics);
      recursiveHexagons(x5, y5, oneThird, graphics);
      recursiveHexagons(x6, y6, oneThird, graphics);
    }
  }

  private static void hexagon(int centerX, int centerY, int edge, Graphics graphics) {
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    int shorter = (int) ((double) edge * Math.sin(Math.toRadians(30)));
    int longer = (int) ((double) edge * Math.cos(Math.toRadians(30)));
    int x1 = centerX + shorter;
    int x2 = centerX + edge;
    int x3 = centerX + shorter;
    int x4 = centerX - shorter;
    int x5 = centerX - edge;
    int x6 = centerX - shorter;
    int y1 = centerY - longer;
    int y2 = centerY;
    int y3 = centerY + longer;
    int y4 = centerY + longer;
    int y5 = centerY;
    int y6 = centerY - longer;
    int[] xP = {x1, x2, x3, x4, x5, x6};
    int[] yP = {y1, y2, y3, y4, y5, y6};
    int nP = 6;
    graphics.setColor(new Color(r, g, b, 28));
    graphics.fillPolygon(xP, yP, nP);
    graphics.setColor(new Color(r, g, b));
    graphics.drawPolygon(xP, yP, nP);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
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
