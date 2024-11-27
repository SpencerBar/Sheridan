package ca.sheridancollege.barnessp.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.barnessp.beans.Student;

@Controller
public class StudentController {
	
	List<Student> studentList = new CopyOnWriteArrayList<Student>();

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("serverDate", LocalDate.now());
		return "index";
	}
	
	@GetMapping("/getStudentList")
	public String getStudentList(Model model) {
		studentList.add(new Student(Long.valueOf(1),"Alfred"));
		studentList.add(new Student(Long.valueOf(2),"Jennay"));
		studentList.add(new Student(Long.valueOf(3),"Bruce"));
		studentList.add(new Student(Long.valueOf(4),"RAAAACHEEEL"));
		model.addAttribute("studentList", studentList);
		return "getStudentList";
	}
	
	@GetMapping("/getStudent")
	public String getStudent(Model model) {
		Student student = new Student(Long.valueOf(5), "Frank");
		model.addAttribute("student", student);
		return "getStudent";
	}

}
