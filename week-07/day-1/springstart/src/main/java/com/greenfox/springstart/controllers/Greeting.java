package com.greenfox.springstart.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by peter on 2017.05.02..
 */
@AllArgsConstructor
public class Greeting {

  @Getter
  @Setter
  long id;

  @Getter
  @Setter
  String content;
}
