package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.service.Doubling;
import com.greenfoxacademy.frontend.service.ErrorObj;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * Created by peter on 2017.05.10..
 */
@RestController
public class RestControllers {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorObj missParam() {
    return new ErrorObj("Please provide an input!");
  }

  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
  public ErrorObj mismatchParam() {
    return new ErrorObj("Please provide an input!");
  }

  @RequestMapping(value = "/doubling")
  public Doubling twice(@RequestParam() int input) {
    return new Doubling(input);
  }
}
