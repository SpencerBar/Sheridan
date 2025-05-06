package ca.sheridancollege.barnessp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.barnessp.beans.Student;
import ca.sheridancollege.barnessp.database.DatabaseAccess;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
@Autowired
DatabaseAccess da;

@GetMapping
public List<Student> getStudentCollection() {
return da.findAll();
}

@GetMapping(value = "/{id}") // "value" only here to illustrate our Mappings can do more!
public Student getIndividualStudent(@PathVariable("id") Long id) {
return da.findById(id);
}

@PostMapping(consumes = "application/json")
public String postStudent(@RequestBody Student student) {
return "http://localhost:8080/api/v1/students/" + da.save(student);
}
@PutMapping(consumes="application/json")
public String putStudentCollection(@RequestBody List<Student> studentList) {
da.deleteAll();
da.saveAll(studentList);
return "Total Records:" + da.count();
}

}
