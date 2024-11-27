package ca.sheridancollege.barnessp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.barnessp.beans.Student;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	List<Student> studentList;
	
	@GetMapping("/")
	public String goHome(Model model) {
//		if(session.isNew()) {
//			session.setAttribute("myTest", "New Session");
//		}
//		else {
//			session.setAttribute("myTest", "Welcome Back");
//		}
//		session.setAttribute("sessionID", session.getId());
		model.addAttribute("student",new Student());
		return "index";
}
	
	@GetMapping("/test")
	public String goTest() {
		return "test";
	}
	
	
	@PostMapping("/insertStudent")
	public String insertStudent(HttpSession session, Model model, @ModelAttribute Student student)
	{
		// instead of @modelAttribute you can still use multiple @requestParams instead to make things work
		
		if (session.isNew()) {
			studentList = new ArrayList<Student>();
		}
		else {
			studentList = (ArrayList<Student>)session.getAttribute("studentList");
			studentList.add(student);
		}
		session.setAttribute("studentList", studentList);
		model.addAttribute("student", new Student());

		return "index";
	}
	
}
