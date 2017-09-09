import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by peter on 2017.04.10..
 */
public class Board extends JComponent implements KeyListener {

  Models models;
  Hero hero;
  ArrayList<Monster> monsters;
  Map map;

  public Board() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);

    hero = new Hero();
    models = new Models();
    monsters = new ArrayList<>();
    map = new Map();

    ArrayList<GameObject> emptyTiles = new ArrayList<>();
    for (ArrayList<Tile> currentTileLine :
            map.getTileMap()) {
      for (Tile isFloor :
              currentTileLine) {
        if (isFloor instanceof Floor) {
          emptyTiles.add(isFloor);
        }
      }
    }
    for (int i = 0; i < 3; i++) {
      int random = (int) (Math.random() * emptyTiles.size());
      models.getGameObjects().add(new Skeleton(emptyTiles.get(random).getPosX(),
              emptyTiles.get(random).getPosY()));
      emptyTiles.remove(random);
    }
    models.getGameObjects().add(hero);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (GameObject toDraw :
            models.getGameObjects()) {
      toDraw.draw(graphics);
    }
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
      if ((hero.getPosY() - 1 >= 0) && !(map.getTileMap()
              .get(hero.getPosX())
              .get((hero.getPosY() - 1)) instanceof Wall)) {
        hero.setPosY(hero.getPosY() - 1);
      }
      hero.setImage(ImageHandler.getInstance().HERO_UP);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if ((hero.getPosY() + 1 <= 9) && !((models.getMap().getTileMap()
              .get(hero.getPosX()).get(hero.getPosY() + 1)) instanceof Wall)) {
        hero.setPosY(hero.getPosY() + 1);
      }
      hero.setImage(ImageHandler.getInstance().HERO_DOWN);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (hero.getPosX() - 1 >= 0 && !(models.getMap().getTileMap()
              .get(hero.getPosX() - 1)
              .get(hero.getPosY()) instanceof Wall)) {
        hero.setPosX(hero.getPosX() - 1);
      }
      hero.setImage(ImageHandler.getInstance().HERO_LEFT);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (hero.getPosX() + 1 <= 9 && !((models.getMap().getTileMap()
              .get(hero.getPosX() + 1).get(hero.getPosY()) instanceof Wall))) {
        hero.setPosX(hero.getPosX() + 1);
      }
      hero.setImage(ImageHandler.getInstance().HERO_RIGHT);
    }
    repaint();
  }
}
