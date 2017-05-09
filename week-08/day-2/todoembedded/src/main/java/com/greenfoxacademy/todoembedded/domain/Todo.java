package com.greenfoxacademy.todoembedded.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by peter on 2017.05.09..
 */
@Entity
public class Todo {

  Column
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column
  private String title;

  @Column(columnDefinition = "false")
  private boolean isUrgent;

  @Column(columnDefinition = "false")
  private boolean isDone;
}
