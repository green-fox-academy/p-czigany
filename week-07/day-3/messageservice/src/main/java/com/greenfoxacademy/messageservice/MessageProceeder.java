package com.greenfoxacademy.messageservice;

import com.greenfoxacademy.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by peter on 2017.05.04..
 */
public class MessageProceeder {

  @Autowired
  private MessageService service;

  public void processMessage(String messageText, String emailAddress) {
    this.service.setEmailAddress(emailAddress);
    this.service.setMessageText(messageText);
    this.service.message();
  }
}
