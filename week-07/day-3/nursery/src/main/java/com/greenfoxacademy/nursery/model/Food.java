package com.greenfoxacademy.nursery.model;

/**
 * Created by peter on 2017.05.05..
 */
public enum Food {
  RICE, MICE, LICE, ONIONS;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
