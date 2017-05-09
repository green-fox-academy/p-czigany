package com.greenfoxacademy.connectwmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by peter on 2017.05.09..
 */
@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String title;

  private boolean isUrgent, isDone;

  public Todo() {

  }

  public Todo(String title) {
    this.title = title;
    isUrgent = false;
    isDone = false;
  }

  @Override
  public String toString() {
    return title;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }
}
