package gardenapplication;

import java.util.ArrayList;
import java.util.List;

class Garden {
  
  private List<Plant> gardenPlants;
  
  void plant(Plant toAdd) {
    gardenPlants.add(toAdd);
  }
  
  void water(int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    int plantsToWater = 0;
    for (Plant actualPlant :
        gardenPlants) {
      if (actualPlant.needsWater()) {
        plantsToWater++;
      }
    }
    if (plantsToWater != 0) {
      for (Plant actualPlant :
          gardenPlants) {
        actualPlant.setWaterHeld(actualPlant.getWaterHeld()
            + actualPlant.getAbsorbRatio() * waterAmount / plantsToWater);
      }
    }
  }
  
  void showGarden() {
    for (Plant actualPlant :
            gardenPlants) {
      System.out.print("The " + actualPlant.getColor() +
          " " + actualPlant.getClass().getName()
          .substring(actualPlant.getClass().getName().indexOf('.') + 1) + " ");
      if (actualPlant.needsWater()) {
        System.out.println("needs water");
      } else {
        System.out.println("doesn't need water");
      }
    }
    System.out.println();
  }
  
  Garden() {
    this.gardenPlants = new ArrayList<>();
  }
}
