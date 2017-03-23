/**
 * Created by peter on 2017.03.23..
 */
public class ExStr02 {

  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    url = url.substring(0, 5) + ":" + url.substring(5).replace("bot", "odd");
    System.out.println(url);
  }
}
