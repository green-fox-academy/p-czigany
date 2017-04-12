import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by peter on 2017.04.10..
 */
public class Board extends JComponent implements KeyListener {

  static final int TILEHEIGHT = 72;
  static final int TILEWIDTH = 72;
  Models models;
  Hero hero;

  public Board() {

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);


    hero = new Hero(0, 0);

  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    Models models = new Models();
    for (GameObject toDraw :
            models.getGameObjects()) {
      toDraw.draw(graphics);
    }
    hero.draw(graphics);
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.setPosY(hero.getPosY() - TILEHEIGHT);
      hero.setImage(ImageHandler.getInstance().HERO_UP);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.setPosY(hero.getPosY() + TILEHEIGHT);
      hero.setImage(ImageHandler.getInstance().HERO_DOWN);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.setPosX(hero.getPosX() - TILEWIDTH);
      hero.setImage(ImageHandler.getInstance().HERO_LEFT);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.setPosX(hero.getPosX() + TILEWIDTH);
      hero.setImage(ImageHandler.getInstance().HERO_RIGHT);
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
