package com.greenfoxacademy.messageservice.service;

/**
 * Created by peter on 2017.05.04..
 */
public class TwitterService extends MessageService {

  @Override
  public void message() {
    System.out.println("Tweet sent to " + emailAddress + " with Message=" + messageText);
  }
}
