package ca.sheridancollege.barnessp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ca.sheridancollege.barnessp.beans.Student;

@SpringBootApplication
public class Lec31LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lec31LombokApplication.class, args);
		Student s = new Student();
		s.setId(Long.valueOf(10) );
		s.setFName("Spencer");
		s.setLName("Barnes");
		System.out.println(s);
	}
}
