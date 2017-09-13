package splitstring;

public class StringSplitter {

  public String[] splitString(String input, int cutIndex) {
    String[] output = new String[2];
    try {
      output[0] = input.substring(0, cutIndex);
      output[1] = input.substring(cutIndex);
    } catch (StringIndexOutOfBoundsException exception) {
      System.out.println("ArrayIndexOutOfBoundsException");
    }
    return output;
  }
}
