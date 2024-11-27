package ca.sheridancollege.barnessp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index (Model model) {
		return "index";
	}
	@GetMapping("/haircolour")
	public String getHair (Model model) {
		return "haircolour";
	}
	@GetMapping("/perfectheight")
	public String getHeight (Model model) {
		return "perfectheight";
	}
	@GetMapping("/preferredname")
	public String getName (Model model) {
		return "preferredname";
	}
}
