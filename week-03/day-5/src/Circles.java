import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.31..
 */
public class Circles {

  public static void mainDraw(Graphics graphics) {
    int centerX = 300;
    int centerY = 300;
    int diameter = 600;
    recursiveCircles(centerX, centerY, diameter, graphics);
  }

  private static void recursiveCircles(int centerX, int centerY, int diameter, Graphics graphics) {
    if (diameter < 5) {
    } else {
      circle(centerX, centerY, diameter, graphics);
      int shorter = (int) ((float) diameter / 4 * Math.sin(Math.toRadians(30)));
      int longer = (int) ((float) diameter / 4 * Math.cos(Math.toRadians(30)));
      int half = (int) ((float) diameter / 4);
      recursiveCircles(centerX, centerY - half, diameter / 2, graphics);
      recursiveCircles(centerX + longer, centerY + shorter, diameter / 2, graphics);
      recursiveCircles(centerX - longer, centerY + shorter, diameter / 2, graphics);
    }
  }

  private static void circle(int centerX, int centerY, int diameter, Graphics graphics) {
    graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
            (int) (Math.random() * 256), 64));
    graphics.fillOval(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter);
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
