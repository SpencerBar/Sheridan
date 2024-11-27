package ca.sheridancollege.barnessp.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.beans.Phone;

@Controller
public class HomeController {
	List<Phone> searchedPhoneList = new CopyOnWriteArrayList<Phone>();
	List<Phone> phoneList = new CopyOnWriteArrayList<Phone>();
//	maps to localhost:8080/ and displays the home page
	@GetMapping("/")
	public String goHome(Model model) {
		return "home";
	}
// makes sure the phone object exists in addPhone and displays addPhone.html when a link is pressed or localhost:8080/addPhone is entered
	@GetMapping("/addPhone")
	public String addPhone(Model model) {
		model.addAttribute("phone", new Phone());
		return "addPhone";
	}
//	same for addPhone but instead of a phone object it makes sure it has the phoneList as an attribute
	@GetMapping("/listPhones")
	public String listPhones(Model model) {
		model.addAttribute("phoneList", phoneList);
		return "listPhones";
	}
//	same for above but has all three, phone, phonelist and searchedphonelist as attributes
	@GetMapping("/searchPhones")
	public String searchPhones(Model model) {
		model.addAttribute("phone", new Phone());
		model.addAttribute("phoneList", phoneList);
		model.addAttribute("phoneList", searchedPhoneList);
		return "searchPhones";
	}
	
//	takes the filled out form, creates a new phone object and stores it inside the phoneList, returns to the same page in case you want to add more than one phone
	@PostMapping("/addPhone")
	public String phoneAdd(Model model, @RequestParam String brand, @RequestParam String modelName, @RequestParam String category,@RequestParam Long price,
@RequestParam String features){
		Phone phone = new Phone(brand, modelName,price,category,features);
		phoneList.add(phone);
		model.addAttribute("phone",new Phone());
		model.addAttribute("phoneList", phoneList);
		return "addPhone";
	}
//	more complex, this one creates a dummy phone to use the categories attribute
	@PostMapping("/searchPhones")
	public String searchPhones(Model model,@RequestParam String category) {
		model.addAttribute("phone", new Phone("","",Long.valueOf(0),category,""));
		model.addAttribute("phoneList", phoneList);
//		clears the searched list every time its posted to make sure it doesnt get duplicate data
		searchedPhoneList.clear();
//		checks which category was chosen, for none adds all in the phone list
	    for (Phone phone : phoneList) {
	    	if(category.equals("None")) {
	    		searchedPhoneList.add(phone);
	    		}
//	    	for any other category matches the given category with the category of each phone and if the same adds it to the searched list
	    	else if (phone.getCategory().equals(category)) {
	            searchedPhoneList.add(phone);
	        }
	    }
//	    add phone list to page
	    model.addAttribute("phoneList", searchedPhoneList);
		return "searchPhones";
	}
}
	