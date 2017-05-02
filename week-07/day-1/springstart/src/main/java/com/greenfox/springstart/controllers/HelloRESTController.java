package com.greenfox.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name") String name) {
    return new Greeting(1, "Hello " + name + "!");
  }
}
