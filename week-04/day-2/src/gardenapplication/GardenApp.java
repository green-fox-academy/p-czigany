package gardenapplication;

public class GardenApp {

  public static void main(String[] args) {
    Garden myLittleGarden = new Garden();
    myLittleGarden.plant(new Flower("yellow"));
    myLittleGarden.plant(new Flower("blue"));
    myLittleGarden.plant(new Tree("purple"));
    myLittleGarden.plant(new Tree("orange"));
    myLittleGarden.showGarden();
    myLittleGarden.water(40);
    myLittleGarden.showGarden();
    myLittleGarden.water(70);
    myLittleGarden.showGarden();
  }
}
