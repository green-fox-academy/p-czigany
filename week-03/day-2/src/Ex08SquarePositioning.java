import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by peter on 2017.03.28..
 */
public class Ex08SquarePositioning {

  public static void mainDraw(Graphics graphics) {
    randomlyPlacedSquares(100, 50, graphics);
    randomlyPlacedSquares(130, 100, graphics);
    randomlyPlacedSquares(190, 10, graphics);
  }

  public static void randomlyPlacedSquares(int x, int y, Graphics g) {
    g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
            (int) (Math.random() * 256), (int) (Math.random() * 256)));
    g.fillRect((int) (Math.random() * 250), (int) (Math.random() * 250),
            50, 50);
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
