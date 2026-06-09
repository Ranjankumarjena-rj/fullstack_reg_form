package com.backendstsform.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.backendstsform.demo.userdto.UserDto;

@Controller
public class WelcomeController {
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "index";
    }
}
@GetMapping("/users")
public String getAllUsers(Model model) {
    model.addAttribute("users", userService.getAllUsers());
    return "users";
}
