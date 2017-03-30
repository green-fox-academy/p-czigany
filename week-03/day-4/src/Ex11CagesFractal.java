import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex11CagesFractal {

  public static void mainDraw(int n, Graphics graphics) {
    drawFourLinesFractal(0, 0, 300, 300, graphics);
  }

  public static void drawFourLinesFractal(double topLeftX, double topLeftY, double bottomRightX, double bottomRightY,
          Graphics graph) {
    double width = bottomRightX - topLeftX;
    double height = bottomRightY - topLeftY;
    if (width < 10 {
      return;
    } else {
      graph.drawLine((int) (topLeftX + width * 1d / 3d), (int) topLeftY, (int) (topLeftX + width * 1d / 3d), (int) bottomRightY);
      graph.drawLine((int) (topLeftX + width * 2d / 3d), (int) topLeftY, (int) (topLeftX + width * 2d / 3d), (int) bottomRightY);
      graph.drawLine((int) topLeftX, (int) (topLeftY + height * 1d / 3d), (int) bottomRightX, (int) (topLeftY + height * 1d / 3d));
      graph.drawLine((int) topLeftX, (int) (topLeftY + height * 2d / 3d), (int) bottomRightX, (int) (topLeftY + height * 2d / 3d));
      drawFourLinesFractal(topLeftX + width * 1d / 3d, topLeftY, topLeftX + width * 2 / 3, topLeftY + height * 1d / 3d, graph);
      drawFourLinesFractal(topLeftX + width * 2d / 3d, topLeftY + height * 1d / 3d, bottomRightX, topLeftY + height * 2d / 3d, graph );
      drawFourLinesFractal(topLeftX + width * 1d / 3d, topLeftY + height * 2d / 3d, topLeftX + width * 2d / 3d, bottomRightY, graph);
      drawFourLinesFractal(topLeftX, topLeftY + height * 1d / 3d, topLeftX + width * 1d / 3d, topLeftY + height * 2d / 3d, graph);
    }
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
      super.setBackground(Color.YELLOW);
      mainDraw(300, graphics);
    }
  }
}
