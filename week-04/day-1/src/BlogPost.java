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
  }

  public static void main(String[] args) {
    BlogPost monday = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04");
    monday.text = "Lorem ipsum dolor sit amet.";
    BlogPost tuesday = new BlogPost("Tim Urban", "Wait but why", "2010.10.10");
    tuesday.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    BlogPost wednesday = new BlogPost("William Turton",
            "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.");
    wednesday.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
  }
}
