import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex17 {

  public static void mainDraw(Graphics graphics) {
    int startOffset = 15;
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 150 - startOffset; i += startOffset) {
      graphics.drawLine(150 + 0 * (i + startOffset), 0 + 1 * (i + startOffset),
              150 + 1 * (i + startOffset), 150 + 0 * (i + startOffset));
      graphics.drawLine(300 - 1 * (i + startOffset), 150 + 0 * (i + startOffset),
              150 + 0 * (i + startOffset), 150 + 1 * (i + startOffset));
      graphics.drawLine(150 + 0 * (i + startOffset), 300 - 1 * (i + startOffset),
              150 - 1 * (i + startOffset), 150 + 0 * (i + startOffset));
      graphics.drawLine(0 + 1 * (i + startOffset), 150 + 0 * (i + startOffset),
              150 + 0 * (i + startOffset), 150 - 1 * (i + startOffset));
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
