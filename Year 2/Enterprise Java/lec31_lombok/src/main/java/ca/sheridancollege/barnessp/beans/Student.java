package ca.sheridancollege.barnessp.beans;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Student {
	private Long id;
	@NonNull
	private String fName;
	@NonNull
	private String lName;
		
}