package com.greenfoxacademy.todoembedded.controllers;

import com.greenfoxacademy.todoembedded.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peter on 2017.05.09..
 */
@Controller(value = "/todo")
public class TodoController {

  @Autowired
  private TodoRepository repository;

  @RequestMapping(value = {"/", "/list"})
  public String list() {
    return "todo";
  }
}
