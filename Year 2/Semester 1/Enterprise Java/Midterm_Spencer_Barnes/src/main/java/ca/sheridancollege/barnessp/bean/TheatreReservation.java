package ca.sheridancollege.barnessp.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TheatreReservation {
	private Long id;
	private String title;
	private Long price;
	private String genre;
	private Long seatAvail;
	
	public String[] genres = {"Comedy","Horror","Drama", "Biography", "Fantasy"};
}
