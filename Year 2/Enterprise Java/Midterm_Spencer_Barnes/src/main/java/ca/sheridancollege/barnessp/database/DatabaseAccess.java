package ca.sheridancollege.barnessp.database;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.barnessp.bean.TheatreReservation;
@Repository
public class DatabaseAccess {
	@Autowired
	protected NamedParameterJdbcTemplate jdbc;
	
	public void insertMovie() {
		
		String query= "INSERT INTO TheatreReservation VALUES ()";  
		int	rowsAffected = jdbc.update(query,new HashMap<String, Object>());
		if (rowsAffected > 0)  
			System.out.println("Inserted movie into database."); 
		} 
	
	public void insertMovie(String title, Long price, String genre, Long seatAvail) {
			MapSqlParameterSource namedParams = new MapSqlParameterSource();
			String query= "INSERT INTO TheatreReservation(title,price,genre,seatAvail) VALUES (:title, :price, :genre, :seatAvail)";  
			int	rowsAffected = jdbc.update(query,new HashMap<String, Object>());
			namedParams.addValue("title",title);
			namedParams.addValue("price",price);
			namedParams.addValue("genre",genre);
			namedParams.addValue("seatAvail",seatAvail);
			if (rowsAffected > 0)  
				System.out.println("Inserted movie into database."); 
			} 
	
	public List<TheatreReservation> getRes(){ 
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		String query = "SELECT * FROM TheatreReservation"; 
		
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<TheatreReservation>(TheatreReservation.class)); 
}
	public List<TheatreReservation> getResbyGenre(String genre){ 
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		namedParams.addValue("genre", genre); 
		String query;
		if (genre == "None") 
		{
			query = "SELECT * FROM TheatreReservation"; }
		else {
			query = "SELECT * FROM TheatreReservation WHERE genre = :genre"; 
		}
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<TheatreReservation>(TheatreReservation.class)); 

	} 
	public List<TheatreReservation> getResById(Long id){ 
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		String query = "SELECT * FROM TheatreReservation WHERE id = :id"; 
		namedParams.addValue("id", id); 
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<TheatreReservation>(TheatreReservation.class)); 

	} 
	public void deleteRes(Long id) { 

		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		String query = "DELETE FROM TheatreReservation WHERE id = :id"; 
		namedParams.addValue("id", id); 
		int rowsAffected = jdbc.update(query, namedParams); 
		if (rowsAffected > 0) 
			System.out.println("Deleted Reservation " + id + " from database"); 
	} 
}
