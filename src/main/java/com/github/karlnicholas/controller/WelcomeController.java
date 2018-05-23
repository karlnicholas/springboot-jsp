package com.github.karlnicholas.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		return "welcome";
	}
}