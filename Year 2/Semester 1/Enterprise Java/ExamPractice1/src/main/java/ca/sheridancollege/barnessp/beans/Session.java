package ca.sheridancollege.barnessp.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Session {
	@NonNull
	private Long sessionNo;
	@NonNull
	private String sessionDate;
	@NonNull
	private String slotTime;
	@NonNull
	private Boolean available;
}
