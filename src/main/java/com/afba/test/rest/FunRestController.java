package com.afba.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

  // expose "/" that return "Hello World"
  @GetMapping("/")
  public String sayHello() {

    return "Hello World!!";
  }

  /// Example 1: Null Pointer Dereference
  public void processString(String input) {
    if (input.length() > 5) { // Potential null pointer dereference
      System.out.println(input.toUpperCase());
    }
  }

  // Example 2: Unused Variable
  public int calculateSum(int a, int b) {
    int result = a + b;
    int unusedVariable = 10; // Unused variable
    return result;
  }
}
