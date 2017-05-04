package com.greenfoxacademy.colors.config;

import com.greenfoxacademy.colors.GreenColor;
import com.greenfoxacademy.colors.MyColor;
import com.greenfoxacademy.colors.RedColor;
import com.greenfoxacademy.colors.YellowColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by peter on 2017.05.04..
 */
@Configuration
public class ColorConfig {

  @Bean(name = "red")
  public MyColor getRed() {
    return new RedColor();
  }

  @Bean(name = "green")
  @Primary
  public MyColor getGreen() {
    return new GreenColor();
  }

  @Bean(name = "yellow")
  public MyColor getYellow() {
    return new YellowColor();
  }
}
