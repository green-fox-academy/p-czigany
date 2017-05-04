package com.greenfoxacademy.messageservice.configuration;

import com.greenfoxacademy.messageservice.service.EmailService;
import com.greenfoxacademy.messageservice.service.MessageService;
import com.greenfoxacademy.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by peter on 2017.05.04..
 */
@Configuration
public class MessageConfiguration {

  @Bean
  @Primary
  public MessageService getTwitterService() {
    return new TwitterService();
  }

  @Bean
  public MessageService getEmailService() {
    return new EmailService();
  }
}
