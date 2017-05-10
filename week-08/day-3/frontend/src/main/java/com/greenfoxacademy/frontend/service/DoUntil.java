package com.greenfoxacademy.frontend.service;

/**
 * Created by peter on 2017.05.10..
 */
public class DoUntil {

  public DoUntil() {

  }

  public int factorial(int n) {
    if (n >= 2) {
      return n * factorial(n - 1);
    } else {
      return 1;
    }
  }

  public int adder(int n) {
    if (n >= 2) {
      return n + adder(n - 1);
    } else {
      return 1;
    }
  }
}
