package com.greenfoxacademy.thstart.controller;

import com.greenfoxacademy.thstart.model.BankAccount2;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by peter on 2017.05.03..
 */
@Controller
public class Ex07BankAccountController {

  @RequestMapping(value = "/ex07")
  public String accountOfClient(@RequestParam("client") int index, Model model) {
    ArrayList<BankAccount2> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount2("Nala", 3000, "lion", false));
    bankAccountList.add(new BankAccount2("Rafiki", 500, "mandrill", false));
    bankAccountList.add(new BankAccount2("Zazu", 3000, "red-billed hornbill", false));
    bankAccountList.add(new BankAccount2("Mufasa", 0, "dead lion", false));
    bankAccountList.add(new BankAccount2("Simba", 2000, "lion", true));
    bankAccountList.add(new BankAccount2("Timon", 300000, "meerkat", false));
    BankAccount2 account = bankAccountList.get(index - 1);
    model.addAttribute("isKing", account.isKing());
    model.addAttribute("index", index);
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animalType", account.getAnimalType());
    return "bankaccount07";
  }
}
