/**
 * Created by peter on 2017.04.03..
 */
public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.publicationDate = publicationDate;
    text = "";
  }
}
