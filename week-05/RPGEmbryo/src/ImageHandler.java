import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by peter on 2017.04.12..
 */
public class ImageHandler {

  private static ImageHandler singleInstance = null;
  public BufferedImage FLOOR, WALL, HERO_DOWN, HERO_UP, HERO_LEFT_DEAD, HERO_LEFT, HERO_RIGHT, SKELETON, SKELETON_RED, SKELETON_GREEN, BOSS;

  private ImageHandler() {
    try {
      FLOOR = ImageIO.read(new File("assets/floor.png"));
      WALL = ImageIO.read(new File("assets/wall.png"));
      HERO_DOWN = ImageIO.read(new File("assets/hero-down.png"));
      HERO_UP = ImageIO.read(new File("assets/hero-up.png"));
      HERO_LEFT = ImageIO.read(new File("assets/hero-left.png"));
      HERO_RIGHT = ImageIO.read(new File("assets/hero-right.png"));
      HERO_LEFT_DEAD = ImageIO.read(new File("assets/hero-left-dead.png"));
      SKELETON = ImageIO.read(new File("assets/skeleton.png"));
      SKELETON_RED = ImageIO.read(new File("assets/skeletonred.png"));
      SKELETON_GREEN = ImageIO.read(new File("assets/skeletongreen.png"));
      BOSS = ImageIO.read(new File("assets/boss.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ImageHandler getInstance() {
    if (singleInstance == null) {
      singleInstance = new ImageHandler();
    }
    return singleInstance;
  }
}
