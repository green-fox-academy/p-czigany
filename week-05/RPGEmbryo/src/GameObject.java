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

  public BufferedImage getImage() {
    return image;
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setImage(BufferedImage image) {
    this.image = image;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }
}
