package com.greenfoxacademy.frontend.service;

/**
 * Created by peter on 2017.05.10..
 */
public class ErrorObj {

  private String error;

  public ErrorObj() {

  }

  public ErrorObj(String errorEnd) {
    error = "Please provide " + errorEnd + "!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
