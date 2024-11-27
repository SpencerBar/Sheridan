package ca.sheridancollege.barnessp.beans;

import java.util.Date;



import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Employee {

 private Long EMPLOYEE_ID;
 private String FIRST_NAME;
 private String LAST_NAME;
 private String EMAIL;
 private String PHONE_NUMBER;
 private Date HIRE_DATE;
 private String JOB_ID; 
 private Long SALARY;
 private Long COMMISSION_PCT;
 private Long MANAGER_ID;
 private Long DEPARTMENT_ID;
}
