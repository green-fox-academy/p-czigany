import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex20Triangles {

  public static void mainDraw(Graphics graphics) {
    double size = 30;
    int x1 = 0;
    int y1 = 300;
    for (int j = 0; j <= 300 - size; j += size) {
      smallTriangle(size, x1 + j, y1, graphics);
    }
  }

  public static void smallTriangle(double size, int xOffset, int yOffset, Graphics g) {
    int[] xCoords = {xOffset, (int) (xOffset + size), (int) (xOffset + (size / 2))};
    int[] yCoords = {yOffset, yOffset, (int) (yOffset - (size * 0.866025))};
    g.drawPolygon(xCoords, yCoords, 3);
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
