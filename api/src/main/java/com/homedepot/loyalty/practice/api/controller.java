package com.homedepot.loyalty.practice.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ResponseEntity<String> helloWorld() {
    return new ResponseEntity<>("", HttpStatus.OK);
  }

}
