package com.greenfox.pczigany.reddit.controllers;

import com.greenfox.pczigany.reddit.models.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2017.05.12..
 */
@RestController
public class PostsController {

  @Autowired
  private PostRepository repository;

}
