package com.greenfox.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peter on 2017.05.02..
 */
@Controller
public class HelloWebController {

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }
}
