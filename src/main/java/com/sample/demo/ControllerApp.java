package com.sample.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerApp {

	@GetMapping("/demo")
	public String getData(@RequestParam(name = "name", required = false, defaultValue = "TCSer")String name, Model model) {
		model.addAttribute("name", name);
		return "demo";
	}
	
}
