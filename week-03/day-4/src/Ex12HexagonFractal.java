import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex12HexagonFractal {

  private static final double HEIGHT_FACTOR = Math.sqrt(3) / 2;

  private static void mainDraw(int n, Graphics graphics) {
    drawHexagonFractal(50, 150, 150, graphics);
  }

  private static void drawHexagonFractal(double side, double centerX, double centerY, Graphics graph) {
    if (side < 10) {
      return;
    }

    double[][] vectors = {
        {(-1) * .5 * side, (-1) * HEIGHT_FACTOR * side},
        {.5 * side, (-1) * HEIGHT_FACTOR * side},
        {side, 0},
        {.5 * side, HEIGHT_FACTOR * side},
        {(-1) * .5 * side, HEIGHT_FACTOR * side},
        {(-1) * side, 0}
    };

    drawHexagon(side, centerX, centerY, graph);
    drawHexagon(side / 2, centerX + vectors[0][0] / 2, centerY + vectors[0][1] / 2, graph);
    drawHexagon(side / 2, centerX + vectors[2][0] / 2, centerY + vectors[2][1] / 2, graph);
    drawHexagon(side / 2, centerX + vectors[4][0] / 2, centerY + vectors[4][1] / 2, graph);

    drawHexagonFractal(side / 2,centerX + vectors[0][0] / 2, centerY + vectors[0][1] / 2, graph);
    drawHexagonFractal(side / 2, centerX + vectors[2][0] / 2, centerY + vectors[2][1] / 2, graph);
    drawHexagonFractal(side / 2, centerX + vectors[4][0] / 2, centerY + vectors[4][1] / 2, graph);
  }

  private static void drawHexagon(double side, double centerX, double centerY, Graphics g) {
    double[][] vectors = {
        {(-1) * .5 * side, (-1) * HEIGHT_FACTOR * side},
        {.5 * side, (-1) * HEIGHT_FACTOR * side},
        {side, 0},
        {.5 * side, HEIGHT_FACTOR * side},
        {(-1) * .5 * side, HEIGHT_FACTOR * side},
        {(-1) * side, 0}
    };
    int[] xCoords = {(int) (centerX + vectors[0][0]), (int) (centerX + vectors[1][0]), (int) (centerX + vectors[2][0]), (int) (centerX + vectors[3][0]), (int) (centerX + vectors[4][0]), (int) (centerX + vectors[5][0])};
    int[] yCoords = {(int) (centerY + vectors[0][1]), (int) (centerY + vectors[1][1]), (int) (centerY + vectors[2][1]), (int) (centerY + vectors[3][1]), (int) (centerY + vectors[4][1]), (int) (centerY + vectors[5][1])};
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
      mainDraw(300, graphics);
    }
  }
}
