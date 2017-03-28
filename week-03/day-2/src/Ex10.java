import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex10 {

  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < 100; i++) {
      colouredCenterBox(3 * (100 - i),
              new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
                      (int) (Math.random() * 256)), graphics);
    }
  }

  public static void colouredCenterBox(int a, Color colour, Graphics g) {
    g.setColor(colour);
    g.fillRect(150 - (a / 2), 150 - (a / 2),
            a, a);
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
