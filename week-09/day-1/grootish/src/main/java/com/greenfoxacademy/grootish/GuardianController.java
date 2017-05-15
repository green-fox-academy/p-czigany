package com.greenfoxacademy.grootish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

  @Autowired
  Cargo cargo;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseEntity<ErrorObj> missParam() {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorObj());
  }

  @RequestMapping(value = "/groot")
  public IAmGroot groot(@RequestParam("message") String somemessage) {
    return new IAmGroot(somemessage);
  }

  @RequestMapping(value = "/yondu")
  public Arrow arrow(@RequestParam double distance, @RequestParam double time) {
    return new Arrow(distance, time);
  }

  @RequestMapping(value = "/rocket")
  public Cargo rocket() {
    return cargo;
  }

  @RequestMapping(value = "/rocket/fill")
  public Status rocket(@RequestParam String caliber, @RequestParam int amount) {
    cargo.fill(caliber, amount);
    Status status = new Status();
    status.setAmount(amount);
    status.setReceived(caliber);
    status.setShipstatus(String.valueOf((double)
            (cargo.getCaliber25() + cargo.getCaliber30() + cargo.getCaliber50()) / 125) + "%");
    status.setReady(cargo.getCaliber25() + cargo.getCaliber30() + cargo.getCaliber50() == 12500);
    return status;
  }
}
