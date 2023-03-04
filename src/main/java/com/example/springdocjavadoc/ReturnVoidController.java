package com.example.springdocjavadoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * aa
 */
@RestController
@RequestMapping("void")
public class ReturnVoidController {
  /**
   * Sample method.
   *
   * @param value doc for the request body
   */
  @GetMapping
  public void something(@RequestBody final String value) {
    // whatever
  }
}
