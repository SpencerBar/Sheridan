package ca.sheridancollege.barnessp.controller;



import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.beans.ContestRegistration;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
	@PostMapping("/formPost")
	public String formPost(@RequestParam String firstName,
			@RequestParam String email,
			@RequestParam LocalDate contestDate,
			@RequestParam LocalTime contestTime) {
		ContestRegistration c1 = new ContestRegistration(firstName, email, contestDate, contestTime);
		System.out.println(c1);
		return "working";
	}

}
