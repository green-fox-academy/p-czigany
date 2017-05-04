package com.greenfoxacademy.messageservice.service;

/**
 * Created by peter on 2017.05.04..
 */
public abstract class MessageService {

  String emailAddress, messageText;

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public abstract void message();
}
