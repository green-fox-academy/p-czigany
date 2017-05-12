package com.greenfox.pczigany.reddit.services;

import com.greenfox.pczigany.reddit.models.Post;
import java.util.ArrayList;

/**
 * Created by peter on 2017.05.12..
 */
public class PostList {

  private Iterable<Post> posts;

  public PostList() {
    posts = new ArrayList<>();
  }

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
