import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.31..
 */
public class Tree {

  public static void mainDraw(Graphics graphics) {
    int startX = 300;
    int startY = 600;
    int x1 = 300;
    int y1 = 450;
    double ratio = 4 / 5;

    recursiveLines(startX, startY, x1, y1, graphics);
  }

  private static void recursiveLines(double startX, double startY, double endX, double endY,
          Graphics graphics) {
    if (Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2)) < 10) {
    } else {
      double beta = Math.toRadians(5 + (int) (Math.random() * 50));
      graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
              (int) (Math.random() * 256), (int) (Math.random() * 256)));
      graphics.drawLine((int) startX, (int) startY, (int) endX, (int) endY);
      recursiveLines(endX, endY, endX + (endX - startX) * 2 / 3, endY + (endY - startY) * 2 / 3,
              graphics);
      recursiveLines(endX, endY, endX
              + (((Math.cos(beta)) * (endX - startX)) - ((Math.sin(beta) * (endY - startY)))) * 2
              / 3, endY
              + (((Math.sin(beta)) * (endX - startX)) + ((Math.cos(beta) * (endY - startY)))) * 2
              / 3, graphics);
      recursiveLines(endX, endY, endX
              + (((Math.cos(-beta)) * (endX - startX)) - ((Math.sin(-beta) * (endY - startY)))) * 2
              / 3, endY
              + (((Math.sin(-beta)) * (endX - startX)) + ((Math.cos(-beta) * (endY - startY)))) * 2
              / 3, graphics);
    }
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
      setBackground(Color.BLACK);
    }
  }
}
