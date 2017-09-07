public class SharpieApp {

  public static void main(String[] args) {
    Sharpie orangeSharpie = new Sharpie("green", 1.5f);
    System.out.println(orangeSharpie.color);
    orangeSharpie.use();
    orangeSharpie.use();
    orangeSharpie.use();
    orangeSharpie.use();
    System.out.println(orangeSharpie.inkAmount);
    SharpieSet ss = new SharpieSet();
    ss.listOfSharpies.add(orangeSharpie);
    System.out.println(ss.countUsable());
  }
}
