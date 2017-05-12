package com.greenfox.pczigany.reddit.controllers;

import com.greenfox.pczigany.reddit.models.Post;
import com.greenfox.pczigany.reddit.models.PostRepository;
import com.greenfox.pczigany.reddit.services.PostInput;
import com.greenfox.pczigany.reddit.services.PostList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2017.05.12..
 */
@RestController
public class PostsController {

  @Autowired
  private PostRepository repository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public PostList list() {
    PostList postList = new PostList();
    postList.setPosts(repository.findAll());
    return postList;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addnew(@RequestBody PostInput input) {
    Post post = new Post(input.getTitle(), input.getHref());
    repository.save(post);
    return post;
  }

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upvote(@PathVariable("id") long id) {
    Post post = repository.findOne(id);
    post.setScore(post.getScore() + 1);
    repository.save(post);
    return repository.findOne(id);
  }

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downvote(@PathVariable("id") long id) {
    Post post = repository.findOne(id);
    post.setScore(post.getScore() - 1);
    repository.save(post);
    return repository.findOne(id);
  }
}
