import java.util.ArrayList;

/**
 * Created by peter on 2017.04.03..
 */
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    ArrayList<Thing> items = new ArrayList<>();
    items.add(new Thing("Get milk"));
    items.add(new Thing("Remove the obstacles"));
    items.add(new Thing("Stand up"));
    items.add(new Thing("Eat lunch"));
    for (Thing item:
    items) {
      fleet.add(item);
    }
    items.get(2).complete();
    items.get(3).complete();
    System.out.println(fleet);
  }
}
