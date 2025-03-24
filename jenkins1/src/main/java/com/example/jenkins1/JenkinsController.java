package com.example.jenkins1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class JenkinsController {
	
	@GetMapping("/Sample")
	public String method1() {
		return "Hello World";
	}

}
