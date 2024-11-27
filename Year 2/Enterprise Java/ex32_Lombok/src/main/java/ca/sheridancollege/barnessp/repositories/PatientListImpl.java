package ca.sheridancollege.barnessp.repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.barnessp.beans.Patient;
import lombok.Data;

@Component
@Data
public class PatientListImpl implements PatientList {

	private List<Patient> patientList = new 
			CopyOnWriteArrayList<Patient>();


	public void emptyList() {
		patientList.clear();

	}

}
