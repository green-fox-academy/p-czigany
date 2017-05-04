package com.greenfoxacademy.messageservice.configuration;

import com.greenfoxacademy.messageservice.MessageProceeder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by peter on 2017.05.04..
 */
@Configuration
public class ProceederConfiguration {

  @Bean
  public MessageProceeder getMessageProceeder() {
    return new MessageProceeder();
  }
}
