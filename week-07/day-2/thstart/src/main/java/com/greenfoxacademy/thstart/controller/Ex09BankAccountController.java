package com.greenfoxacademy.thstart.controller;

import com.greenfoxacademy.thstart.model.BankAccount3;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by peter on 2017.05.03..
 */
@Controller
public class Ex09BankAccountController {

  @RequestMapping(value = "/ex09")
  public String accountOfClient(@RequestParam("client") int index, Model model) {
    ArrayList<BankAccount3> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount3("Nala", 3000, "lion", false, true));
    bankAccountList.add(new BankAccount3("Rafiki", 500, "mandrill", false, true));
    bankAccountList.add(new BankAccount3("Zazu", 3000, "red-billed hornbill", false, true));
    bankAccountList.add(new BankAccount3("Mufasa", 0, "dead lion", false, true));
    bankAccountList.add(new BankAccount3("Simba", 2000, "lion", true, true));
    bankAccountList.add(new BankAccount3("Timon", 300000, "meerkat", false, true));
    bankAccountList.add(new BankAccount3("Scar", 3000, "lion", false, false));
    BankAccount3 account = bankAccountList.get(index - 1);
    model.addAttribute("isGood", account.isGood());
    model.addAttribute("isKing", account.isKing());
    model.addAttribute("index", index);
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animalType", account.getAnimalType());
    return "bankaccount09";
  }
}
