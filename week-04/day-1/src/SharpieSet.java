import java.util.ArrayList;

import java.util.List;

/**
 * Created by peter on 2017.04.03..
 */
public class SharpieSet {

  List<Sharpie> listOfSharpies = new ArrayList<>();

  public int countUsable() {
    int usables = 0;
    for (Sharpie pen :
            listOfSharpies) {
      usables = (pen.inkAmount > 0) ? usables++ : usables;
    }
    return usables;
  }

  public List<Sharpie> removeTrash() {
    int i = 0;
    while (i < listOfSharpies.size()) {
      if (listOfSharpies.get(i).inkAmount > 0) {
        listOfSharpies.remove(i);
      } else {
        i++;
      }
    }
    return listOfSharpies;
  }
}
