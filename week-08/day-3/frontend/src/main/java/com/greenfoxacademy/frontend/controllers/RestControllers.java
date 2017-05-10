package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.service.Appendage;
import com.greenfoxacademy.frontend.service.DoUntil;
import com.greenfoxacademy.frontend.service.Doubling;
import com.greenfoxacademy.frontend.service.ErrorObj;
import com.greenfoxacademy.frontend.service.Greeting;
import com.greenfoxacademy.frontend.service.Result;
import com.greenfoxacademy.frontend.service.Until;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * Created by peter on 2017.05.10..
 */
@RestController
public class RestControllers {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorObj missParam(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("title") || e.getParameterName().equals("name")) {
      return new ErrorObj("a " + e.getParameterName());
    } else {
      return new ErrorObj("an input");
    }
  }

  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
  public ErrorObj mismatchParam() {
    return new ErrorObj("an appropriate input");
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorObj noPostArgument() {
    return new ErrorObj("a number");
  }

  @RequestMapping(value = "/doubling")
  public Doubling twice(@RequestParam() int input) {
    return new Doubling(input);
  }

  @RequestMapping(value = "/greeter")
  public Greeting greet(@RequestParam("name") String name, @RequestParam("title") String title) {
    return new Greeting(name, title);
  }

  @RequestMapping(value = "/appenda/{appendable}")
  public Appendage greet(@PathVariable("appendable") String append) {
    return new Appendage(append);
  }

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public Result doUntil(@PathVariable("what") String operator, @RequestBody Until until) {
    if (operator.equals("sum")) {
      return new Result((new DoUntil().adder(until.getUntil())));
    } else if (operator.equals("factor")) {
      return new Result((new DoUntil().factorial(until.getUntil())));
    } else {
      return new Result(0);
    }
  }
}
