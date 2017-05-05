package com.greenfoxacademy.nursery.config;

import com.greenfoxacademy.nursery.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by peter on 2017.05.05..
 */
@Configuration
public class FoxConfig {

  @Bean
  public Fox getFox() {
    return new Fox();
  }
}
