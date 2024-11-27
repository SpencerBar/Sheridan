package ca.sheridancollege.barnessp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("/")
	public String goHome(Model model){
		return "Home";
	}

	@GetMapping("/testme")
	public String testMe(Model model){
		return "TestMe";
	}
	}
