import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex16 {

  public static void mainDraw(Graphics graphics) {
    int startOffset = 5;

    doubleWeb(startOffset, 0, 0, 150, 150, new Color(128, 0, 128), Color.GREEN, graphics);
    doubleWeb(startOffset, 150, 0, 300, 150, new Color(128, 0, 128), Color.GREEN, graphics);
    doubleWeb(startOffset, 150, 150, 300, 300, new Color(128, 0, 128), Color.GREEN, graphics);
    doubleWeb(startOffset, 0, 150, 150, 300, new Color(128, 0, 128), Color.GREEN, graphics);
  }

  public static void doubleWeb(int offset, int x1, int y1, int x2, int y2, Color col1, Color col2,
          Graphics graph) {
    upperRightCornerWeb(offset, x1, y1, x2, y2, col1, graph);
    lowerLeftCornerWeb(offset, x1, y1, x2, y2, col2, graph);
  }

  public static void upperRightCornerWeb(int offset, int x1, int y1, int x2, int y2, Color colour,
          Graphics graph) {
    graph.setColor(colour);
    for (int i = 0; i < 150; i += offset) {
      graph.drawLine(x1 + i + offset, y1, x2, y1 + i + offset);
    }
  }

  public static void lowerLeftCornerWeb(int offset, int x1, int y1, int x2, int y2, Color colour,
          Graphics graph) {
    graph.setColor(colour);
    for (int i = 0; i < 150; i += offset) {
      graph.drawLine(x1, y1 + i + offset, x1 + i + offset, y2);
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
      mainDraw(graphics);

    }
  }

}