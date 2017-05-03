package com.greenfoxacademy.thstart.model;

/**
 * Created by peter on 2017.05.03..
 */
public class BankAccount {
  private String name, animalType;
  private int balance;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
}
