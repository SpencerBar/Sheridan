package ca.sheridancollege.barnessp.beans;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Reservation {
	@NonNull
	private Long regNo; 
	@NonNull
	private Date regDate;
	@NonNull
	private Long sessionNo;
	@NonNull
	private String email;

}
