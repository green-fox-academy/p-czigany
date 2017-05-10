package com.greenfoxacademy.frontend.service;

/**
 * Created by peter on 2017.05.10..
 */
public class Appendage {

  private String appended;

  public Appendage(String appendTo) {
    appended = appendTo + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
