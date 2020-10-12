package com.homedepot.loyalty.practice.persistence;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

  //Create copy of List using List.copyOf()
  //Create List by using stream on aboveList use either dropWhile or takeWhile to return just Hello and world
  //for loop through list to create one string 'Hello World' tip: use new string method .stripTrailing
  public String getHello() {
    var list = List.of("Hello      ", "World", "hi", "bye", "see", "Hello      ", "World");

    var listCopy = List.copyOf(list);

    var filteredList = listCopy.stream().takeWhile(n -> !n.equals("hi")).collect(Collectors.toList());

    StringBuilder returnString = new StringBuilder();
    for (var str : filteredList) {
      returnString.append(str.stripTrailing());
      returnString.append(" ");
    }



    return returnString.toString().stripTrailing();
  }
}
