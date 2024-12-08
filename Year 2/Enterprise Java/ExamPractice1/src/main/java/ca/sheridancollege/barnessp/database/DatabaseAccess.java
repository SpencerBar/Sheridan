package ca.sheridancollege.barnessp.database;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.barnessp.beans.Reservation;
import ca.sheridancollege.barnessp.beans.Session;
import ca.sheridancollege.barnessp.beans.User;

@Repository
public class DatabaseAccess {
	@Autowired
	protected NamedParameterJdbcTemplate jdbc;

	public List<Session> getAvailable(){
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		String query = "SELECT * FROM SessionDetails WHERE available = true"; 
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<Session>(Session.class)); 
	}
	public List<Session> getAll(){
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		String query = "SELECT * FROM SessionDetails"; 
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<Session>(Session.class)); 
	}
	public List<Reservation> getRes(){
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		String query = "SELECT * FROM Registration"; 
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<Reservation>(Reservation.class)); 
	}
	public void addReservation(Long sessionNo, Date date, String email) {
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		namedParams.addValue("sessionNo", sessionNo);
	    namedParams.addValue("date", date);
	    namedParams.addValue("email", email);
	    String query = "INSERT INTO Registration (sessionNo, regDate, email) " +
	                   "VALUES (:sessionNo, :date, :email)";
	    jdbc.update(query, namedParams);
	    setAvailable(sessionNo);
		
	}
	public void setAvailable(Long sessionNo) {
		MapSqlParameterSource namedParams = new MapSqlParameterSource(); 
		namedParams.addValue("sessionNo", sessionNo);
		String query = "UPDATE SessionDetails SET available = false WHERE sessionNo = :sessionNo";
		jdbc.update(query, namedParams);
	}
	
//	security stuff:
	
	public User findUserAccount(String email) {
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		String query = "SELECT * FROM sec_user where email = :email";
		namedParameters.addValue("email", email);
		try {
		return jdbc.queryForObject(query,namedParameters,new BeanPropertyRowMapper<User>(User.class));
		} catch (EmptyResultDataAccessException erdae) {
		return null;
		}
		
	}
	
	public List<String> getRolesById(Long userId) {
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		String query = "SELECT sec_role.roleName "
		+ "FROM user_role, sec_role "
		+ "WHERE user_role.roleId = sec_role.roleId "
		+ "AND userId = :userId";
		namedParameters.addValue("userId", userId);
		return jdbc.queryForList(query, namedParameters, String.class);
		}
}
