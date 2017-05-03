package com.greenfoxacademy.thstart.model;

/**
 * Created by peter on 2017.05.03..
 */
public class BankAccount2 {

  private String name, animalType;
  private int balance;
  private boolean king;

  public BankAccount2(String name, int balance, String animalType, Boolean king) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public int getBalance() {
    return balance;
  }

  public boolean isKing() {
    return king;
  }
}
