package com.greenfox.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by peter on 2017.05.02..
 */
@Controller
public class HelloNameCountController {

  private AtomicLong reloads = new AtomicLong(1);

  @RequestMapping(value = "/web/greetingtime")
  public String greeting(@RequestParam("name") String name, Model m) {
    m.addAttribute("name", name);
    m.addAttribute("reloads", reloads.getAndIncrement());
    return "greetingtime";
  }
}
