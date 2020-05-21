package com.pinecrow.serviceController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(value = "/")
	public String hello() {
		return "Hello World!! This is harini";
	}

}
