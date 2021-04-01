package com.junit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestController {
	private static final Logger logger = LoggerFactory.getLogger(RequestController.class);
	@GetMapping("/test")
	public String test() {
		logger.info("in Controller Case");
		return "Test Success";
	}

}
