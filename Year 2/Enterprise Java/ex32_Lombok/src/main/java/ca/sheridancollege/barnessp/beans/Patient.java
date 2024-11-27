package ca.sheridancollege.barnessp.beans;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Patient {
	@NonNull
	private Long id;
	private String patient_name;
	private Long doctor_id;
	private String patient_history;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patient_name=" + patient_name + ", doctor_id=" + doctor_id
				+ ", patient_history=" + patient_history + "]";
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getPatient_history() {
		return patient_history;
	}

	public void setPatient_history(String patient_history) {
		this.patient_history = patient_history;
	}

}
