package com.toddlindner.test.testnative2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String testHello() {
		return "hello at " + new java.util.Date();
	}
}
