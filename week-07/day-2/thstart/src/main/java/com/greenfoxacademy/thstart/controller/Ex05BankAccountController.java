package com.greenfoxacademy.thstart.controller;

import com.greenfoxacademy.thstart.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by peter on 2017.05.03..
 */
@Controller
public class Ex05BankAccountController {

  @RequestMapping(value = "/ex05")
  public String accountOfClient(@RequestParam("client") int index, Model model) {
    ArrayList<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Nala", 3000, "lion"));
    bankAccountList.add(new BankAccount("Rafiki", 500, "mandrill"));
    bankAccountList.add(new BankAccount("Zazu", 3000, "red-billed hornbill"));
    bankAccountList.add(new BankAccount("Mufasa", 0, "dead lion"));
    bankAccountList.add(new BankAccount("Timon", 300000, "meerkat"));
    BankAccount account = bankAccountList.get(index - 1);
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animalType", account.getAnimalType());
    return "bankaccount05";
  }
}
