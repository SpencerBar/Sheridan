package ca.sheridancollege.barnessp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ca.sheridancollege.barnessp.beans.Patient;
import ca.sheridancollege.barnessp.repositories.PatientList;

@Controller
public class PatientController {
	private PatientList patientList;
	public PatientController(PatientList patientList) {
		super();
		this.patientList = patientList;
	}

	@GetMapping("/")
	public String index(Model model) {
		System.out.println("Clearing List");
		patientList.emptyList();
		return "index";
	}

//	get submitted form information
	@PostMapping("/processForm")
	public String processForm(@RequestParam Long patient_id, @RequestParam String patient_name,
			@RequestParam Long doctor_id, @RequestParam String patient_history) {
//		Patient patient = new Patient(patient_id, patient_name, doctor_id, patient_history);
		
		Patient patient = Patient.builder()
				.id(Long.valueOf(patient_id))
				.doctor_id(Long.valueOf(doctor_id))
				.patient_history(patient_history)
				.patient_name(patient_name)
				.build();
		patientList.getPatientList().add(patient);
		System.out.println("***");
		for (Patient p : patientList.getPatientList()) {
			System.out.println(p);
		}
		return "working";
	}

}
