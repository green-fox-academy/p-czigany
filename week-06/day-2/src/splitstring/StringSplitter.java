package splitstring;

/**
 * Created by peter on 2017.04.19..
 */
public class StringSplitter {

  public String[] splitString(String input, int cutIndex) {
    String[] output = new String[2];
    output[0] = input.substring(0, cutIndex);
    output[1] = input.substring(cutIndex);
    return output;
  }
}
