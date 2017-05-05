package com.greenfoxacademy.nursery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by peter on 2017.05.05..
 */
@Configuration
public class ModelAndViewFactory {

  @Bean
  public ModelAndView getModelAndView() {
    return new ModelAndView();
  }
}
