package com.greenfoxacademy.connectwmysql.controllers;

import com.greenfoxacademy.connectwmysql.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peter on 2017.05.09..
 */
@Controller(value = "/todo")
public class TodoController {

  @Autowired
  private TodoRepository repository;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todo";
  }
}
