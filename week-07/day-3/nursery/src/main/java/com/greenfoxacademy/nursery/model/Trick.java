package com.greenfoxacademy.nursery.model;

/**
 * Created by peter on 2017.05.05..
 */
public class Trick {
  private String text;

  public Trick(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}
