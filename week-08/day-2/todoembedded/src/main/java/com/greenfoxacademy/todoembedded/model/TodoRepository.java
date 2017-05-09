package com.greenfoxacademy.todoembedded.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by peter on 2017.05.09..
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
