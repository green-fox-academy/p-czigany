package com.greenfoxacademy.nursery.controller;

import com.greenfoxacademy.nursery.config.ModelAndViewFactory;
import com.greenfoxacademy.nursery.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by peter on 2017.05.04..
 */
@Controller
public class MainController {

  @Autowired
  private ModelAndViewFactory modelAndViewFactory;
  @Autowired
  private Fox fox;

  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("index");
    m.addObject("fox", fox);
    return m;
  }
}
