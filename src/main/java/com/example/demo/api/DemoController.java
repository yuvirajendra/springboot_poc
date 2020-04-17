package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/springBoot")
	public String returnMessage() {
		return "Hello SpringBoot";
	}
}