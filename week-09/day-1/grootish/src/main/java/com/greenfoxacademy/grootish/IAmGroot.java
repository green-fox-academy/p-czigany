package com.greenfoxacademy.grootish;

/**
 * Created by peter on 2017.05.15..
 */
public class IAmGroot {

  private String received, translated;

  public IAmGroot(String received) {
    this.received = received;
    translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
