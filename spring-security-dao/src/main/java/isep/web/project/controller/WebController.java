package isep.web.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class WebController 
{
	@GetMapping("/all")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/login")
	public String securedHello() {
		return "Hello Security";
	}
}
