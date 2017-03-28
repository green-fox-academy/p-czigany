import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex15 {

  public static void mainDraw(Graphics graphics) {
    int startOffset = 20;
    upperRightCornerWeb(startOffset, new Color(128, 0, 128), graphics);
    lowerLeftCornerWeb(startOffset, Color.GREEN, graphics);
  }

  public static void upperRightCornerWeb(int offset, Color colour, Graphics graph) {
    graph.setColor(colour);
    for (int i = 0; i < 300 / offset; i++) {
      graph.drawLine((i + 1) * offset, 0, 300, (i + 1) * offset);
    }
  }

  public static void lowerLeftCornerWeb(int offset, Color colour, Graphics graph) {
    graph.setColor(Color.GREEN);
    for (int i = 0; i < 300 / offset; i++) {
      graph.drawLine(0, (i + 1) * offset, (i + 1) * offset, 300);
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
