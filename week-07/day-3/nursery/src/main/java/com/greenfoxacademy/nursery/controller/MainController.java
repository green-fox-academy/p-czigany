package com.greenfoxacademy.nursery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peter on 2017.05.04..
 */
@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }
}
