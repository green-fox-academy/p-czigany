package com.greenfoxacademy.connectwmysql;

import com.greenfoxacademy.connectwmysql.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectWMySQLApplication implements CommandLineRunner {

  @Autowired
  private TodoRepository repo;

  public static void main(String[] args) {
    SpringApplication.run(ConnectWMySQLApplication.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {

  }
}
