package com.greenfoxacademy.grootish;

import org.springframework.stereotype.Component;

/**
 * Created by peter on 2017.05.15..
 */
@Component
public class Cargo {

  private int caliber25, caliber30, caliber50;
  private boolean ready;
  private String shipstatus;

  public Cargo() {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    ready = false;
    shipstatus = "empty";
  }

  public void fill(String caliber, int amount) {
    while ((caliber.equals(".25") || caliber.equals(".30") || caliber.equals(".50")) && (
            caliber25 + caliber30 + caliber50 < 12500) && (amount > 0)) {
      switch (caliber) {
        case ".25":
          caliber25++;
          amount--;
        case ".30":
          caliber30++;
          amount--;
        case ".50":
          caliber50++;
          amount--;
      }
    }
    int payload = caliber25 + caliber30 + caliber50;
    if (payload == 12500) {
      shipstatus = "full";
      ready = true;
    } else if (payload > 0) {
      shipstatus = "nonempty";
    }
  }

  public int getCaliber25() {
    return caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public boolean isReady() {
    return ready;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }
}
