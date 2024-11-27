package ca.sheridancollege.barnessp.database;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.barnessp.bean.Student;

@Repository
public class DatabaseAccess {
	@Autowired
	protected NamedParameterJdbcTemplate jdbc;
	
//	public void insertStudent() {
//		String query= "INSERT INTO student(name) VALUES ('Frank')"; 
//		int	rowsAffected = jdbc.update(query,new HashMap<String, Object>());
//		if (rowsAffected > 0) 
//			System.out.println("Inserted student into database.");
//		}
	
	public void insertStudent(String name) {
		String query= "INSERT INTO student(name) VALUES(:name)"; 
		MapSqlParameterSource namedParams = new MapSqlParameterSource();
		namedParams.addValue("name", name);
		int	rowsAffected = jdbc.update(query, namedParams);
		if (rowsAffected > 0) 
			System.out.println("Inserted student into database.");
		}
	
	public List<Student> getStudents(){
		MapSqlParameterSource namedParams = new MapSqlParameterSource();
		String query = "SELECT * FROM student";
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public List<Student> getStudentById(Long id){
		MapSqlParameterSource namedParams = new MapSqlParameterSource();
		String query = "SELECT * FROM student WHERE id = :id";
		namedParams.addValue("id", id);
		return jdbc.query(query, namedParams, new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public void deleteStudent(Long id) {
		MapSqlParameterSource namedParams = new MapSqlParameterSource();
		String query = "DELETE FROM student WHERE id= :id";
		namedParams.addValue("id", id);
		int rowsAffected = jdbc.update(query, namedParams);
		if (rowsAffected > 0)
			System.out.println("Deleted student " + id + " from database");
	}
	public void updateStudentById(Long id,String name) {
		MapSqlParameterSource namedParams = new MapSqlParameterSource();
		String query = "UPDATE student SET name=:name WHERE id= :id";
		namedParams.addValue("id", id);
		namedParams.addValue("name", name);
		int rowsAffected = jdbc.update(query, namedParams);
		if (rowsAffected > 0)
			System.out.println("record has been updated with " + name);
	}
	
}
