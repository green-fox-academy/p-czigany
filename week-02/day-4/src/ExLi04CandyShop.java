import java.util.ArrayList;

/**
 * Created by peter on 2017.03.23..
 */
public class ExLi04CandyShop {

  public static void main(String... args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);
    arrayList.set(arrayList.indexOf(2), "Croissant");
    arrayList.set(arrayList.indexOf(false), "Ice cream");
    System.out.println(arrayList);
  }
}
