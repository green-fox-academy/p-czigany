package com.greenfoxacademy.nursery.model;

/**
 * Created by peter on 2017.05.05..
 */
public enum Drink {
  WATER, MILK, LEMONADE, SOULS;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
