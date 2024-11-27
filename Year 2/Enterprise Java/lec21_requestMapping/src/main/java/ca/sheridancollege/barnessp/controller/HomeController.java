package ca.sheridancollege.barnessp.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.beans.Student;

@Controller
public class HomeController {
 
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
	@PostMapping("/formPost")
	public String formPost(@RequestParam String firstName,
							@RequestParam String lastName,
							@RequestParam String email,
							@RequestParam Long studentNum,
							@RequestParam LocalDate dateOfBirth) {
		Student s1 = new Student(firstName, lastName, email, studentNum, dateOfBirth);
		System.out.println(s1);
		return "working";
	}
}
