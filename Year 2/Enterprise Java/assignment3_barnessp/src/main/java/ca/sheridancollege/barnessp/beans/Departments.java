package ca.sheridancollege.barnessp.beans;

import org.springframework.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Departments {
	private Long DEPARTMENT_ID;
	@NonNull
	private String DEPARTMENT_NAME;
	private Long MANAGER_ID;
	private Long LOCATION_ID;
}
