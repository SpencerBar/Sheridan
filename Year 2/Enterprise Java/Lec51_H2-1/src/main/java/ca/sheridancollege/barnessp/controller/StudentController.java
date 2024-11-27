package ca.sheridancollege.barnessp.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.bean.Student;
import ca.sheridancollege.barnessp.database.DatabaseAccess;


@Controller
public class StudentController {
	List<Student> studentList = new CopyOnWriteArrayList<Student>();
	
	@Autowired
	private DatabaseAccess da;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("studentList", da.getStudents());
		model.addAttribute("student", new Student());
		return "index";
	}
	
	@PostMapping("/insertStudent")
	public String insertStudent(Model model, @RequestParam String name) {
		da.insertStudent(name);
		model.addAttribute("studentList", da.getStudents());
		model.addAttribute("student", new Student());
		return "index";
	}
	@GetMapping("/editStudent/{id}")
	public String editStudent(Model model, @PathVariable Long id) {
		Student student = da.getStudentById(id).get(0);
		model.addAttribute("student", student);
		model.addAttribute("studentList", da.getStudents());
		return "index";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(Model model, @PathVariable Long id) {
		model.addAttribute("student", new Student());
		model.addAttribute("studentList", da.getStudents());
		da.deleteStudent(id);
		return "index";
	}
	@PostMapping("/updateStudent")
	public String updateStudent(Model model, @ModelAttribute Student s) {	
		da.updateStudentById(s.getId(),s.getName());
		model.addAttribute("student", new Student());
		model.addAttribute("studentList", da.getStudents());
		
		return "index";
	}
	
}
