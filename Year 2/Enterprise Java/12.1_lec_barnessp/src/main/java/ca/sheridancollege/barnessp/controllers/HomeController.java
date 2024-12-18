package ca.sheridancollege.barnessp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import ca.sheridancollege.barnessp.beans.Student;

@Controller
public class HomeController {
	final String REST_URL = "http://localhost:8080/api/v1/students";
	
	@GetMapping("/")
	public String index(Model model, RestTemplate restTemplate) {
	ResponseEntity<Student[]> responseEntity = restTemplate.getForEntity
	(REST_URL, Student[].class);
	model.addAttribute("studentList", responseEntity.getBody());
	return "index";
	}
	@GetMapping(value="/getStudent/{id}", produces="application/json")
	@ResponseBody
	public Student getStudent(@PathVariable("id") int id,RestTemplate restTemplate) {
	ResponseEntity<Student> responseEntity = restTemplate.getForEntity
	(REST_URL + "/" + id,Student.class);
	return responseEntity.getBody();
	}


}
