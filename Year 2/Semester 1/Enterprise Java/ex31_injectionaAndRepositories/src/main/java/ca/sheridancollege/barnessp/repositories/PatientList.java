package ca.sheridancollege.barnessp.repositories;

import java.util.List;

import ca.sheridancollege.barnessp.beans.Patient;

public interface PatientList {
	public List<Patient> getPatientList();
	
	public void setPatientList(List<Patient> patientList);
	
	public void emptyList();
	
}
