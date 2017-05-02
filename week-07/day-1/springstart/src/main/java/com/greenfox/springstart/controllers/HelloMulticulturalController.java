package com.greenfox.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by peter on 2017.05.02..
 */
@Controller
public class HelloMulticulturalController {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  private AtomicLong reloads = new AtomicLong(1);

  @RequestMapping(value = "/web/greetmulticultural")
  public String greeting(@RequestParam("name") String name, Model m) {
    m.addAttribute("fontSize", ((int) (Math.random() * 30)) + 8);
    m.addAttribute("colorCode", "rgb(" + String.valueOf((int) (Math.random() * 256)) + ", " + String.valueOf((int) (Math.random() * 256)) + ", " + String.valueOf((int) (Math.random() * 256)) + ")");
    m.addAttribute("greetingPhrase", hellos[((int) (Math.random() * hellos.length)) % hellos.length]);
    m.addAttribute("name", name);
    return "colorfulworld";
  }
}
