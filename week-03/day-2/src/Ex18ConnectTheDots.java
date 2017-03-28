import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex18ConnectTheDots {

  public static void mainDraw(Graphics graphics) {
    int[][] boxPoints = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] polyPoints = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    polygon(boxPoints, graphics);
    polygon(polyPoints, graphics);
  }

  public static void polygon(int[][] points, Graphics g) {
    g.setColor(Color.GREEN);
    int[] xCoords = new int[points.length];
    int[] yCoords = new int[points.length];
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points[i].length; j++) {
        xCoords[i] = points[i][0];
        yCoords[i] = points[i][1];
      }
    }
    g.drawPolygon(xCoords, yCoords, points.length);
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
