package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelComeController {

	@GetMapping("/welcome")
	public String welcomM(Model model) {
		model.addAttribute("message", "Hello World!, This is the simpliLearn Project for Phase: DevOps");
		return "welcome";
	}
	
	
}
