package com.greenfoxacademy.frontend.service;

/**
 * Created by peter on 2017.05.10..
 */
public class Doubling {

  private int received;
  private int result;

  public Doubling() {

  }

  public Doubling(int received) {
    this.received = received;
    result = 2 * received;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
