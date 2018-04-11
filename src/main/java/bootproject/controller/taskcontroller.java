package bootproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bootproject.service.taskservice;;


@Controller
public class taskcontroller {
	/*@Autowired
	private taskservice taskservice;*/
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
