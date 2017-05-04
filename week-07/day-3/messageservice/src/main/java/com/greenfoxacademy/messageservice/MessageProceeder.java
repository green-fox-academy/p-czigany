package com.greenfoxacademy.messageservice;

import com.greenfoxacademy.messageservice.configuration.MessageConfiguration;
import com.greenfoxacademy.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by peter on 2017.05.04..
 */
public class MessageProceeder {

  ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageConfiguration.class);

    MessageService service = (MessageService) ctx.getBean("twitter");

  public void processMessage(String messageText, String emailAddress) {
    this.service.setEmailAddress(emailAddress);
    this.service.setMessageText(messageText);
    this.service.message();
  }
}
