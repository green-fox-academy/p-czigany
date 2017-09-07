public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorName, String title, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.publicationDate = publicationDate;
    text = "";
  }
}
