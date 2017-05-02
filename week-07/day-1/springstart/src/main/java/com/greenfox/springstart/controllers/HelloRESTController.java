package com.greenfox.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  private AtomicLong toID = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name") String name) {
    return new Greeting(toID.getAndIncrement(), "Hello " + name + "!");
  }
}
