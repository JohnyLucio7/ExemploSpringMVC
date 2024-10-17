package com.ap101gamestudio.exemplo_spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("mensagem", "Bem vindo ao Spring MVC!");
		
		return "hello";
	}
}
