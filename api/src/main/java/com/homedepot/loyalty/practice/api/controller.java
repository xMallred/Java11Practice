package com.homedepot.loyalty.practice.api;

import com.homedepot.loyalty.practice.persistence.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

  @Autowired
  private HelloService helloService;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ResponseEntity<String> helloWorld() {
    return new ResponseEntity<>(helloService.getHello(), HttpStatus.OK);
  }

}
