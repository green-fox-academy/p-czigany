import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by peter on 2017.04.10..
 */
public class GameObject {

  private BufferedImage image;
  private int posX, posY;

  public GameObject(BufferedImage image, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    this.image = image;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
