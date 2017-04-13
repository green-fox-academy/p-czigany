import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.03..
 */
public class Blog {

  //  Create a Blog class
  //  list of BlogPosts
  //  add BlogPosts to your list
  //  delete(int) one item at given index
  //  update(int, BlogPost) one item at the given index and update it with another BlogPost

  List<BlogPost> postsList;

  public Blog() {
    postsList = new ArrayList<>();
  }

  public void add(BlogPost toAdd) {
    postsList.add(toAdd);
  }

  public void delete(int index) {
    postsList.remove(index);
  }

  public void update(int index, BlogPost overwriteWith) {
    postsList.remove(index);
    postsList.add(index, overwriteWith);
  }
}
