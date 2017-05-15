package com.greenfoxacademy.grootish;

/**
 * Created by peter on 2017.05.15..
 */
public class Status {

  private String received, shipstatus;
  private int amount;
  private boolean ready;

  public Status() {
  }

  public String getReceived() {
    return received;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public int getAmount() {
    return amount;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
