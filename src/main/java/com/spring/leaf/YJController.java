package com.spring.leaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class YJController {

	@GetMapping("/project")
	public String project() {
		return "project-list";
		
	} 
	
}
