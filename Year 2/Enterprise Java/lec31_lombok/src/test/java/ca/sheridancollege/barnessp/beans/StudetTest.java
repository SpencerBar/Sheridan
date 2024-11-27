package ca.sheridancollege.barnessp.beans;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StudetTest {
	@Test
	public void build() {
		Student s = Student.builder()
				.id(Long.valueOf(10))
				.fName("Tan")
				.lName("lname")
				.build();
		assertThat(s.getId()).isEqualTo(10);
		assertThat(s.getFName()).isEqualTo("Tan");
		assertThat(s.getLName()).isEqualTo("lname");
	}
	
}
