package ca.sheridancollege.barnessp.beans;

import java.time.LocalDate;

public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private Long studentNum;
	private LocalDate dateOfBirth;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(Long studentNum) {
		this.studentNum = studentNum;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Student(String firstName, String lastName, String email, Long studentNum, LocalDate dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.studentNum = studentNum;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", studentNum="
				+ studentNum + ", dateOfBirth=" + dateOfBirth + "]";
	}
	}
	 
	
