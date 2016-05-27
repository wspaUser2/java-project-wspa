package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/greet")
	public String helloAction(@RequestParam(value = "name", required = false, defaultValue="Marek") String name,Model uiModel){
		uiModel.addAttribute("name",name);
		return "example_file";
	}
}
