package com.greenfoxacademy.messageservice.service;

/**
 * Created by peter on 2017.05.04..
 */
public class EmailService extends MessageService {

  @Override
  public void message() {
    System.out.println("Email sent to " + emailAddress + " with Message=" + messageText);
  }
}
