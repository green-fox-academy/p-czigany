package com.greenfoxacademy.thstart.controller;

import com.greenfoxacademy.thstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peter on 2017.05.03..
 */
@Controller
public class Ex01Controller {

  @RequestMapping(value = "/new")
  public String simba(Model model) {
    BankAccount lionKing = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", lionKing.getName());
    model.addAttribute("balance", lionKing.getBalance());
    model.addAttribute("animalType", lionKing.getAnimalType());
    return "bankaccount";
  }
}
