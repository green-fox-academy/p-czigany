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
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    hero = new Hero(0, 0);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    models = new Models();
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
      if ((hero.getPosY() - TILEHEIGHT >= 0 * TILEHEIGHT) && !((models.getMap().getTileMap().get(hero.getPosX()/72).get((hero.getPosY() - TILEHEIGHT)/72)) instanceof Wall)) {
        hero.setPosY(hero.getPosY() - TILEHEIGHT);
      }
      hero.setImage(ImageHandler.getInstance().HERO_UP);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if ((hero.getPosY() + TILEHEIGHT <= 9 * TILEHEIGHT) && !((models.getMap().getTileMap().get(hero.getPosX()/72).get((hero.getPosY() + TILEHEIGHT)/72)) instanceof Wall)) {
        hero.setPosY(hero.getPosY() + TILEHEIGHT);
      }
      hero.setImage(ImageHandler.getInstance().HERO_DOWN);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if ((hero.getPosX() - TILEWIDTH >= 0 * TILEWIDTH) && !((models.getMap().getTileMap().get((hero.getPosX() - TILEWIDTH)/72).get((hero.getPosY())/72)) instanceof Wall)) {
        hero.setPosX(hero.getPosX() - TILEWIDTH);
      }
      hero.setImage(ImageHandler.getInstance().HERO_LEFT);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if ((hero.getPosX() + TILEWIDTH <= 9 * TILEWIDTH) && !((models.getMap().getTileMap().get((hero.getPosX() + TILEWIDTH)/72).get(hero.getPosY()/72)) instanceof Wall)) {
        hero.setPosX(hero.getPosX() + TILEWIDTH);
      }
      hero.setImage(ImageHandler.getInstance().HERO_RIGHT);
    }
    repaint();
  }
}
