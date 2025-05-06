package ca.sheridancollege.barnessp.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.beans.Employee;
import ca.sheridancollege.barnessp.beans.Departments;
import ca.sheridancollege.barnessp.database.DatabaseAccess;

@Controller
public class HomeController {
	@Autowired
	@Lazy
	private DatabaseAccess da;
//	general redirects 
	@GetMapping("/")
	public String index() {
	return "index";
	}
	@GetMapping("/admin")
	public String secureIndex() {
	return "/secure/index";
	}
	@GetMapping("/user")
	public String userIndex() {
	return "/user/index";
	}
	@GetMapping("/login")
	public String login() {
	return "login";
	}
	@GetMapping("/permission-denied")
	public String permissionDenied() {
	return "/error/permission-denied";
	}
	
	@GetMapping("/register")
	public String AcctRegistration() {
		return "register";
	}
//	diverts to addrole in da to add a user to the database
	@PostMapping("/register")
	public String postRegister(@RequestParam String username, @RequestParam String password) {
		da.addUser(username, password);
		Long userId = da.findUserAccount(username).getUserId();
		da.addRole(userId, Long.valueOf(1));
	return "redirect:/";
	}
//	more get mapping for insert update and delete, making sure to import required attributes
	@GetMapping("user/insert")
	public String insert(Model model){
		List<Departments> departments = da.getAllDepartments();
	    model.addAttribute("departments", departments);
		
		return "user/Insert";
		}
	@GetMapping("user/update")
	public String update(Model model) {
	    List<Departments> departments = da.getAllDepartments();
	    model.addAttribute("departments", departments);
	    return "user/Update";
	}
	@GetMapping("admin/delete")
	public String delete(Model model) {
		List<Employee> employees = da.getAllEmployees();
		model.addAttribute("employees", employees);
		return "secure/Delete";
	}
//	post mapping for the three pages, taking the request parameters and sending them to da.
	@PostMapping("/insert")
	public String empInsert(@RequestParam Long EMPLOYEE_ID,@RequestParam String FIRST_NAME,@RequestParam String LAST_NAME,
			@RequestParam String EMAIL, @RequestParam String PHONE_NUMBER,@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date HIRE_DATE,
			@RequestParam String JOB_ID,
			@RequestParam Long SALARY,@RequestParam Double COMMISSION_PCT,@RequestParam Long MANAGER_ID,@RequestParam Long DEPARTMENT_ID) {
		da.addEmp(EMPLOYEE_ID, FIRST_NAME, LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID);
		return "user/Insert";
	}
//	i tried making the update fields not required and left some of my work but didnt get it fully working
	@PostMapping("/update")
	public String empUpdate(@RequestParam Long EMPLOYEE_ID,@RequestParam (required = false)String FIRST_NAME,@RequestParam (required = false)String LAST_NAME,
			@RequestParam(required = false) String EMAIL, @RequestParam (required = false)String PHONE_NUMBER,
			@RequestParam (required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date HIRE_DATE,@RequestParam (required = false)String JOB_ID,
			@RequestParam (required = false)Long SALARY,@RequestParam(required = false) Long COMMISSION_PCT,@RequestParam (required = false)Long MANAGER_ID,
			@RequestParam (required = false)Long DEPARTMENT_ID) {
		da.updateEmp(EMPLOYEE_ID, FIRST_NAME, LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID);
		return "user/Update";
	}
//	this one was easy :)
	@PostMapping("/delete")
	public String empDelete(@RequestParam Long EMPLOYEE_ID) {
	    if (EMPLOYEE_ID == null) {
	        System.err.println("EMPLOYEE_ID is null!");
	        return "secure/Index";
	    }
	    System.out.println("Received EMPLOYEE_ID: " + EMPLOYEE_ID); 
	    da.deleteEmp(EMPLOYEE_ID);
	    return "secure/Index";
	}

}
