package com.greenfoxacademy.grootish;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2017.05.15..
 */
@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorObj missParam() {
    return new ErrorObj();
  }

  @RequestMapping(value = "/groot")
  public IAmGroot groot(@RequestParam("message") String somemessage) {
    return new IAmGroot(somemessage);
  }
}
