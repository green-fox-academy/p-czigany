package com.greenfox.pczigany.reddit.services;

import com.greenfox.pczigany.reddit.models.Post;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.05.12..
 */
public class PostList {

  private List<Post> posts;

  public PostList() {
    posts = new ArrayList<>();
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }
}
