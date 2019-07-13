package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/message")
public class MessageController {

	@GetMapping
	public String get() {
		return "ok\n";
	}

}
