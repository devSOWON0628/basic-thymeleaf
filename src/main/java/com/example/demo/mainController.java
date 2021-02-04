package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class mainController {
			
	@GetMapping("/")
	public ModelAndView main(Model m) {
		ModelAndView mv = new ModelAndView("test");
		mv.addObject("data","sowon");
		return mv;
	}
	
	@GetMapping("hi")
	public String hello() {
		return "Hello World";
	}
	
	
	
}
