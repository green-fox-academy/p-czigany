package com.greenfoxacademy.nursery.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.05.05..
 */
public class Fox {
  private String name;
  private List<Trick> tricks;
  private Food food;
  private Drink drink;

  public Fox() {
    name = "Smirre";
    tricks = new ArrayList<>();
    tricks.add(new Trick("write HTML"));
    tricks.add(new Trick("code in Java"));
    food = Food.RICE;
    drink = Drink.WATER;
  }

  // Getters:

  public String getName() {
    return name;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public Food getFood() {
    return food;
  }

  public Drink getDrink() {
    return drink;
  }

  // Setters:

  public void setFood(Food food) {
    this.food = food;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }
}
