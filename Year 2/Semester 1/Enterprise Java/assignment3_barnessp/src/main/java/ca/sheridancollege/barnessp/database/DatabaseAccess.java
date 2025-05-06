package ca.sheridancollege.barnessp.database;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.barnessp.beans.Departments;
import ca.sheridancollege.barnessp.beans.Employee;
import ca.sheridancollege.barnessp.beans.User;

@Repository
public class DatabaseAccess {
	@Autowired
	private NamedParameterJdbcTemplate jdbc;
	@Autowired
	private PasswordEncoder passwordEncoder;

//listen its a mess but its my mess
//	for finding user account during login
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
//		adding user into dbase
		public void addUser(String email,String password) {
			MapSqlParameterSource namedParameters = new MapSqlParameterSource();
			String query = "INSERT INTO sec_user "
			+ "(email, encryptedPassword,enabled) "
			+ "VALUES (:email, :encryptedPassword,1)";
			namedParameters.addValue("email", email);
			namedParameters.addValue("encryptedPassword",
			passwordEncoder.encode(password));
			jdbc.update(query, namedParameters);
			}
//adding role into dbase
		public void addRole(Long userId, Long roleId) {
			MapSqlParameterSource namedParameters = new MapSqlParameterSource();
			String query = "INSERT INTO user_role (userId, roleId) "
			+ "VALUES (:userId, :roleId)";
			namedParameters.addValue("userId", userId);
			namedParameters.addValue("roleId", roleId);
			jdbc.update(query, namedParameters);
			}
//		add employee, adding all the values to the namedparameters and then executing the query to insert
		public void addEmp(Long EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME,String EMAIL,String PHONE_NUMBER,
				Date HIRE_DATE,String JOB_ID,Long SALARY,Double COMMISSION_PCT,Long MANAGER_ID, Long DEPARTMENT_ID) {
			MapSqlParameterSource namedParameters = new MapSqlParameterSource();
			String query = "INSERT INTO EMPLOYEES "
			+ "(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID, DEPARTMENT_ID) "
			+ "VALUES (:EMPLOYEE_ID,:FIRST_NAME,:LAST_NAME,:EMAIL,:PHONE_NUMBER,:HIRE_DATE,:JOB_ID,:SALARY,:COMMISSION_PCT,:MANAGER_ID, :DEPARTMENT_ID)";
			namedParameters.addValue("EMAIL", EMAIL);
			namedParameters.addValue("EMPLOYEE_ID", EMPLOYEE_ID);
			namedParameters.addValue("FIRST_NAME", FIRST_NAME);
			namedParameters.addValue("LAST_NAME", LAST_NAME);
			namedParameters.addValue("PHONE_NUMBER", PHONE_NUMBER);
			namedParameters.addValue("HIRE_DATE", HIRE_DATE);
			namedParameters.addValue("JOB_ID", JOB_ID);
			namedParameters.addValue("SALARY", SALARY);
			namedParameters.addValue("COMMISSION_PCT", COMMISSION_PCT);
			namedParameters.addValue("MANAGER_ID", MANAGER_ID);
			namedParameters.addValue("DEPARTMENT_ID", DEPARTMENT_ID);
			jdbc.update(query, namedParameters);
			}
//		updating emp, same as insert, just adding the variables to the named params and executing the query to update them
		public void updateEmp(Long EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME,String EMAIL,String PHONE_NUMBER,Date HIRE_DATE,String JOB_ID,Long SALARY,Long COMMISSION_PCT,Long MANAGER_ID, Long DEPARTMENT_ID) {
			MapSqlParameterSource namedParameters = new MapSqlParameterSource();
			String query ="UPDATE EMPLOYEES SET FIRST_NAME = :FIRST_NAME, LAST_NAME = :LAST_NAME,EMAIL = "
					+ ":EMAIL,PHONE_NUMBER = :PHONE_NUMBER, HIRE_DATE = :HIRE_DATE,JOB_ID = :JOB_ID,SALARY = "
					+ ":SALARY,COMMISSION_PCT = :COMMISSION_PCT, MANAGER_ID = :MANAGER_ID,DEPARTMENT_ID = "
					+ ":DEPARTMENT_ID WHERE EMPLOYEE_ID = :EMPLOYEE_ID";
			namedParameters.addValue("EMAIL", EMAIL);
			namedParameters.addValue("EMPLOYEE_ID", EMPLOYEE_ID);
			namedParameters.addValue("FIRST_NAME", FIRST_NAME);
			namedParameters.addValue("LAST_NAME", LAST_NAME);
			namedParameters.addValue("PHONE_NUMBER", PHONE_NUMBER);
			namedParameters.addValue("HIRE_DATE", HIRE_DATE);
			namedParameters.addValue("JOB_ID", JOB_ID);
			namedParameters.addValue("SALARY", SALARY);
			namedParameters.addValue("COMMISSION_PCT", COMMISSION_PCT);
			namedParameters.addValue("MANAGER_ID", MANAGER_ID);
			namedParameters.addValue("DEPARTMENT_ID", DEPARTMENT_ID);
			jdbc.update(query, namedParameters);
			}
		
//		this is my failed (ish) attempt at making the fields not required. it sorta works and i figured you would appreciate the effort
//			public void updateEmp(Long EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME, String EMAIL,
//					String PHONE_NUMBER, Date HIRE_DATE, String JOB_ID, Long SALARY, Long COMMISSION_PCT,
//					Long MANAGER_ID, Long DEPARTMENT_ID) {
//
//				MapSqlParameterSource namedParameters = new MapSqlParameterSource();
//
//				StringBuilder query = new StringBuilder("UPDATE EMPLOYEES SET ");
//
//				if (FIRST_NAME != null) {
//					query.append("FIRST_NAME = :FIRST_NAME, ");
//					namedParameters.addValue("FIRST_NAME", FIRST_NAME);
//				}
//				if (LAST_NAME != null) {
//					query.append("LAST_NAME = :LAST_NAME, ");
//					namedParameters.addValue("LAST_NAME", LAST_NAME);
//				}
//				if (EMAIL != null) {
//					query.append("EMAIL = :EMAIL, ");
//					namedParameters.addValue("EMAIL", EMAIL);
//				}
//				if (PHONE_NUMBER != null) {
//					query.append("PHONE_NUMBER = :PHONE_NUMBER, ");
//					namedParameters.addValue("PHONE_NUMBER", PHONE_NUMBER);
//				}
//				if (HIRE_DATE != null) {
//					query.append("HIRE_DATE = :HIRE_DATE, ");
//					namedParameters.addValue("HIRE_DATE", HIRE_DATE);
//				}
//				if (JOB_ID != null) {
//					query.append("JOB_ID = :JOB_ID, ");
//					namedParameters.addValue("JOB_ID", JOB_ID);
//				}
//				if (SALARY != null) {
//					query.append("SALARY = :SALARY, ");
//					namedParameters.addValue("SALARY", SALARY);
//				}
//				if (COMMISSION_PCT != null) {
//					query.append("COMMISSION_PCT = :COMMISSION_PCT, ");
//					namedParameters.addValue("COMMISSION_PCT", COMMISSION_PCT);
//				}
//				if (MANAGER_ID != null) {
//					query.append("MANAGER_ID = :MANAGER_ID, ");
//					namedParameters.addValue("MANAGER_ID", MANAGER_ID);
//				}
//				if (DEPARTMENT_ID != null) {
//					query.append("DEPARTMENT_ID = :DEPARTMENT_ID, ");
//					namedParameters.addValue("DEPARTMENT_ID", DEPARTMENT_ID);
//				}
//				query.delete(query.length() - 2, query.length());
//
//
//				query.append(" WHERE EMPLOYEE_ID = :EMPLOYEE_ID");
//				namedParameters.addValue("EMPLOYEE_ID", EMPLOYEE_ID);
//
//				jdbc.update(query.toString(), namedParameters);
//			}
//delete emp is pretty simple, takes the id, adds to named params, executes the delete statement
			public void deleteEmp(Long EMPLOYEE_ID) {
				    MapSqlParameterSource namedParameters = new MapSqlParameterSource();
				    String query = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = :EMPLOYEE_ID";
				    namedParameters.addValue("EMPLOYEE_ID", EMPLOYEE_ID);
				    jdbc.update(query, namedParameters);
				    System.out.println("deleted ID: " + EMPLOYEE_ID);
				}
			
//just handy for the table i made
			public List<Employee> getAllEmployees() {
		    String sql = "SELECT * FROM EMPLOYEES";
		    return jdbc.query(sql, new BeanPropertyRowMapper<>(Employee.class));
		}
//			this one is for the drop down select
			public List<Departments> getAllDepartments() {
			    String sql = "SELECT * FROM DEPARTMENTS";
			    return jdbc.query(sql, new BeanPropertyRowMapper<>(Departments.class));
			}


}
