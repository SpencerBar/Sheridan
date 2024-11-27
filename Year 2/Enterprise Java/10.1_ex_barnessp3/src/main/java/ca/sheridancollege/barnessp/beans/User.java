package ca.sheridancollege.barnessp.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
	private long userId;
	@NonNull
	private String email;
	@NonNull
	private String encryptedPassword;
	@NonNull
	private boolean enabled;

}
