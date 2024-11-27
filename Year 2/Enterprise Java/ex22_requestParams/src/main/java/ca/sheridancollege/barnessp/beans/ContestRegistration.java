package ca.sheridancollege.barnessp.beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class ContestRegistration {
	private String firstName;
	private String email;
	private LocalDate contestDate;
	public ContestRegistration(String firstName, String email, LocalDate contestDate, LocalTime contestTime) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.contestDate = contestDate;
		this.contestTime = contestTime;
	}
	@Override
	public String toString() {
		return "ContestRegistration [firstName=" + firstName + ", email=" + email + ", contestDate=" + contestDate
				+ ", contestTime=" + contestTime + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getContestDate() {
		return contestDate;
	}
	public void setContestDate(LocalDate contestDate) {
		this.contestDate = contestDate;
	}
	public LocalTime getContestTime() {
		return contestTime;
	}
	public void setContestTime(LocalTime contestTime) {
		this.contestTime = contestTime;
	}
	private LocalTime contestTime;
}
