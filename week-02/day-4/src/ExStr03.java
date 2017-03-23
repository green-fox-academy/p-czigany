/**
 * Created by peter on 2017.03.23..
 */
public class ExStr03 {

  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    StringBuilder rebuiltQuote = new StringBuilder(quote);
    System.out
            .println(rebuiltQuote.insert(rebuiltQuote.indexOf("you"), "always takes longer than "));
  }

}
