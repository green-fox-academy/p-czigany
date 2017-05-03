package com.greenfoxacademy.thstart.controller;

import com.greenfoxacademy.thstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peter on 2017.05.03..
 */
@Controller
public class Ex04EnjoyController {

  @RequestMapping(value = "/ex04")
  public String simba(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("utext", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }
}
