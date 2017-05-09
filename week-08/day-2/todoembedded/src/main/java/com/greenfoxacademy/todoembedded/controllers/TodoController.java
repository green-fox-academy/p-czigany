package com.greenfoxacademy.todoembedded.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peter on 2017.05.09..
 */
@Controller(value = "/todo")
public class TodoController {

  @ResponseBody
  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    return "This is my first todo";
  }
}
