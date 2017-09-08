import java.util.ArrayList;

class Summer {

  int sum(ArrayList<Integer> toSum) {
    int sum = 0;
    if (toSum != null) {
      for (Integer current :
          toSum) {
        sum += current;
      }
    }
    return sum;
  }
}
