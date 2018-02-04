package com.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controllers {

	@RequestMapping("/home")
	 public String greet() {
	  return "My first Rest";
	 }
}
