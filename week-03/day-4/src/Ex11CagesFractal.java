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

  public static void drawFourLinesFractal(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY,
          Graphics graph) {
    int width = bottomRightX - topLeftX;
    int height = bottomRightY - topLeftY;
    if (width < 10) {
      return;
    } else {
      graph.drawLine(topLeftX + width * 1 / 3, topLeftY, topLeftX + width * 1 / 3, bottomRightY);
      graph.drawLine(topLeftX + width * 2 / 3, topLeftY, topLeftX + width * 2 / 3, bottomRightY);
      graph.drawLine(topLeftX, topLeftY + height * 1 / 3, bottomRightX, topLeftY + height / 3);
      graph.drawLine(topLeftX, topLeftY + height * 2 / 3, bottomRightX, topLeftY + height * 2 / 3);
      drawFourLinesFractal(topLeftX + width * 1 / 3, topLeftY, topLeftX + width * 2 / 3, topLeftY + height * 1 / 3, graph);
      drawFourLinesFractal(topLeftX + width * 2 / 3, topLeftY + height * 1 / 3, bottomRightX, topLeftY + height * 2 / 3, graph );
      drawFourLinesFractal(topLeftX + width * 1 / 3, topLeftY + height * 2 / 3, topLeftX + width * 2 / 3, bottomRightY, graph);
      drawFourLinesFractal(topLeftX, topLeftY + height * 1 / 3, topLeftX + width * 1 / 3, topLeftY + height * 2 / 3, graph);
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
