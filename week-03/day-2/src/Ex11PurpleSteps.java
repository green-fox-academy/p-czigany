import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex11PurpleSteps {

  public static void mainDraw(Graphics graphics) {
    purpleSteps(19, graphics);
  }

  public static void purpleSteps(int n, Graphics g) {
    g.setColor(new Color(128, 0, 128));
    for (int i = 0; i < n; i++) {
      g.fillRect(10 + i * 10, 10 + i * 10, 10, 10);
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
