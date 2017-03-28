import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex12 {

  public static void mainDraw(Graphics graphics) {
    increasingPurpleSteps(6, graphics);
  }

  public static void increasingPurpleSteps(int n, Graphics g) {
    g.setColor(new Color(128, 0, 128));
    int j = 10;
    int offset;
    for (int i = 0; i < n; i++) {
      offset = 10 + i * 10;
      g.fillRect(j, j, 10 + i * 10, 10 + i * 10);
      j += offset;
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
