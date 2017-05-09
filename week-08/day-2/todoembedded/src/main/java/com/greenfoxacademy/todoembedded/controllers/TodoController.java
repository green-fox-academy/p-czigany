package com.greenfoxacademy.todoembedded.controllers;

import com.greenfoxacademy.todoembedded.domain.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peter on 2017.05.09..
 */
@Controller(value = "/todo")
public class TodoController {

  @Autowired
  private TodoRepository repository;

  @ResponseBody
  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    return "This is my first todo";
  }
}
