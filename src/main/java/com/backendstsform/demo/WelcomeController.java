package com.backendstsform.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String showForm(Model model) {
    model.addAttribute("userDto", new UserDto()); // ← this line missing
    return "index";
	}
	
}
