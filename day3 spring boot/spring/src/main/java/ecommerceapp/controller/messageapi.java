package ecommerceapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class messageapi {
	//GET
	@GetMapping(value="/showmessage")
	String displayMessage() {
		return "hi how are you";
		
		
	}
	

}
