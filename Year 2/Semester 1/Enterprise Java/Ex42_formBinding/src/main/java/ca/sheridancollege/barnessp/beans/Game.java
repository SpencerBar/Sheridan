package ca.sheridancollege.barnessp.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
// defining our game object and getting lombok to create a no args constructor
@Data
@NoArgsConstructor
public class Game {
	private Long id;
	private String title;
	private String publisher;
	private String platform;
	private double price;
	String[] platforms= {"ps3","ps4","xbox 360","xbox 1","Switch","PC"};
}
