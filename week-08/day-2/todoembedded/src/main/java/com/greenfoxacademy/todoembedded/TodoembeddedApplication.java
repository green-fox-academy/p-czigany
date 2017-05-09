package com.greenfoxacademy.todoembedded;

import com.greenfoxacademy.todoembedded.model.Todo;
import com.greenfoxacademy.todoembedded.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoembeddedApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TodoembeddedApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{
		repo.save(new Todo("Grow anywhere"));
		repo.save(new Todo("Have a light lunch"));
		repo.save(new Todo("Ask anybody for help"));
	}
}
