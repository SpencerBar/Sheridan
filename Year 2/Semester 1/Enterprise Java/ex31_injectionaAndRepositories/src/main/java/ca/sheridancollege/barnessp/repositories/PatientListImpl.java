package ca.sheridancollege.barnessp.repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.barnessp.beans.Patient;

@Component
public class PatientListImpl implements PatientList {

	private List<Patient> patientList = new 
			CopyOnWriteArrayList<Patient>();

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	public void emptyList() {
		patientList.clear();

	}

}
