import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.31..
 */
public class Triangles {

  public static void mainDraw(Graphics graphics) {
    int centerX = 300;
    int centerY = 250;
    int edge = 600;
    graphics.setColor(Color.WHITE);
    triangle(centerX, centerY, edge, true, graphics);
    edge /= 2;
    recursiveTriangles(centerX, centerY, edge, graphics);
  }

  private static void recursiveTriangles(int centerX, int centerY, int edge, Graphics graphics) {
    if (edge < 5) {
    } else {
      int shorter = (int) ((float) edge / 2 * Math.tan(Math.toRadians(30)));
      int longer = (int) ((float) edge * Math.tan(Math.toRadians(30)));
      int half = (int) ((float) edge / 2);
      triangle(centerX, centerY, edge, false, graphics);
      recursiveTriangles(centerX + half, centerY - shorter, half, graphics);
      recursiveTriangles(centerX, centerY + longer , half, graphics);
      recursiveTriangles(centerX - half, centerY - shorter, half, graphics);
    }
  }

  private static void triangle(int centerX, int centerY, int edge, boolean upsideDown, Graphics graphics) {
    graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
            (int) (Math.random() * 256)));
    int shorter = (int) ((float) edge / 2 * Math.tan(Math.toRadians(30)));
    int longer = (int) ((float) edge * Math.tan(Math.toRadians(30)));
    int half = (int) ((float) edge / 2);
    int x1 = centerX;
    int x2 = (upsideDown) ? centerX - half : centerX + half;
    int x3 = (upsideDown) ? centerX + half : centerX - half;
    int y1 = (upsideDown) ? centerY + longer : centerY - longer;
    int y2 = (upsideDown) ? centerY - shorter : centerY + shorter;
    int y3 = y2;
    int[] xP = {x1, x2, x3};
    int[] yP = {y1, y2, y3};
    int nP = 3;
    graphics.fillPolygon(xP, yP, nP);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.setBackground(Color.LIGHT_GRAY);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
