package ca.sheridancollege.barnessp.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	private String bookName;
	private Long isbn;
	private String author;

}
