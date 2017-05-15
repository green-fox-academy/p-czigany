package com.greenfoxacademy.grootish;

/**
 * Created by peter on 2017.05.15..
 */
public class Arrow {

  private double distance, time, speed;

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {
    return speed;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }
}
