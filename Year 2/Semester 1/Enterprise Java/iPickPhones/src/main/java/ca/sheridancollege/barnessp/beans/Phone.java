package ca.sheridancollege.barnessp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//for lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
private String brand;
private String modelName;
private Long price = (long) 0;
private String category;
private String features;
// this is for the dropdown menu, will use these values to populate category
private final String[] categories = {"Flagship", "Mid-Range", "Budget"};
}
