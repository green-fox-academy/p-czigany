package com.greenfoxacademy.hellospring;

import com.greenfoxacademy.hellospring.config.HelloWorldConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellospringApplication {

	public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

    HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

    helloWorld.setMessage("Hello World!");
    helloWorld.getMessage();
	}
}
