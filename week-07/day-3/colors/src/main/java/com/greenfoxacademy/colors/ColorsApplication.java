package com.greenfoxacademy.colors;

import com.greenfoxacademy.colors.config.ColorConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorsApplication {

  public static void main(String[] args) {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfig.class);

    MyColor myColor = ctx.getBean(MyColor.class);

    myColor.printColor();
  }
}
