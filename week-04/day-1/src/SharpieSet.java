import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  List<Sharpie> listOfSharpies;

  SharpieSet() {
    listOfSharpies = new ArrayList<>();
  }

  int countUsable() {
    int usables = 0;
    for (Sharpie pen :
            listOfSharpies) {
      if (pen.isUsable()) {
        usables++;
      }
    }
    return usables;
  }

  public void removeTrash() {
    int i = 0;
    while (i < listOfSharpies.size()) {
      if (listOfSharpies.get(i).inkAmount == 0) {
        listOfSharpies.remove(i);
      } else {
        i++;
      }
    }
  }

  public void add(Sharpie toAdd) {
    listOfSharpies.add(toAdd);
  }
}
