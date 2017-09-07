import java.util.ArrayList;
import java.util.List;

public class Farm {

  //  Create a Farm class
  //  it has list of Animals
  //  it has slots which defines the number of free places for animals
  //  breed() -> creates a new animal if there's place for it
  //  slaughter() -> removes the least hungry animal
  private List<Animal> farmAnimals;
  private int maxNOfAnimals;

  void breed() {
    if (farmAnimals.size() < maxNOfAnimals) {
      farmAnimals.add(new Animal());
    }
  }

  Farm(int maxNOfAnimals) {
    farmAnimals = new ArrayList<>();
    this.maxNOfAnimals = maxNOfAnimals;
  }

  void slaughter() {
    int minHunger = farmAnimals.get(0).hunger;
    int minHungerIndex = 0;
    for (int i = 0; i < farmAnimals.size(); i++) {
      if (minHunger > farmAnimals.get(i).hunger) {
        minHunger = farmAnimals.get(i).hunger;
        minHungerIndex = i;
      }
    }
    farmAnimals.remove(minHungerIndex);
  }
}
