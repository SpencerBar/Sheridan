--set serveroutput on;
----explicit cursor
--DECLARE
--    CURSOR cr IS
--    SELECT employee_ID, Name, Salary
--    FROM employees
--    WHERE salary > 5000;
--
--    v_emp_id employees.employee_id%TYPE;
--    v_first_name employees.first_name%TYPE;
--    v_salary employees.salary%TYPE;
--
--BEGIN
--    OPEN cr:
--    LOOP
--        FETCH cr INTO v_emp_id,v_first_name, v_salary;
--        EXIT WHEN cr%NOTFOUND;
--            dbms_output.put_line(v_emp_id || ' ' ||
--                                v_first_name || ' ' ||
--                                v_salary);
--    END LOOP;
--    CLOSE cr;
--END;
--
---- Implicit cursor
--
--DECLARE
--    
--    v_DptID departments.department_id%TYPE := 10;
--    v_DptName departments.department_name%TYPE;
--    v_MgrID departments.manager_id%TYPE;
--BEGIN
--    SELECT department_name, manager_id
--    INTO v_DptName, v_MgrID
--    FROM departments
--    WHERE department_id = v_DptIDl
--    
--    DBMS_OUTPUT.PUT_LINE('Deptartment: ' ||
--        v_DptName || ', Manager ID: ' || v_MgrID);
--    EXCEPTION
--        WHEN NO_DATA_FOUND THEN
--            DBMS_OUTPUT.PUT_LINE('No department found for ID: '|| v_DptID);
--    
--END;
--
--DECLARE
--    CURSOR orderCR is
--    SELECT order_id, order_date, customer_id
--    FROM order;
--    
--    TYPE orderRT IS RECORD(
--        order_id orders.order_id%TYPE,
--        order_date orders.order_date%TYPE,
--        customer_id orders.customer_id%TYPE
--        );
--        orderR orderRT;
--BEGIN
--    OPEN orderCR;
--    LOOP
--        FETCH orderCR INTO orderR;
--        EXIT WHEN orderCR%NOTFOUND;
--        DBMS_OUTPUT.PUT_LINE('Order ID: '|| OrderR.order_id ||
--                        ', Order Date: '||orderR.order_date || 
--                        ',Customer ID: '||orderR.customer_id);
--    END LOOP;
--    CLOSE orderCR;
--END;
--

--CREATE TABLE PCustomer (
--Cust_ID NUMBER,
--CustFirstname VARCHAR2(12),
--CustLastname VARCHAR2(12),
--CustCity VARCHAR2(18)
--);
--INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
--VALUES (1, 'Roger', 'Waters', 'Toronto');
--INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
--VALUES(2, 'Max', 'Williams', 'Vancouver');
--INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
--VALUES(3, 'Alice', 'John', 'Montreal');
--INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
--VALUES (4, 'Bob', 'Smith', 'Toronto');
--INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
--VALUES (5, 'Charlie', 'Brown', 'Vancouver');
--INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
--VALUES (6, 'Emma', 'Davis', 'Calgary');
--CREATE TABLE PCustomerWest (
--Cust_ID VARCHAR2(4),
--CustName VARCHAR2(24),
--CustCity VARCHAR2(18)
--);
--CREATE TABLE PCustomerEast (
--Cust_ID VARCHAR2(4),
--CustName VARCHAR2(24),
--CustCity VARCHAR2(18)
--);
-- 
--DECLARE
--    TYPE CustR IS RECORD
--    (Custid NUMBER,
--    CustFN VARCHAR(12),
--    CustLN VARCHAR(12),
--    CustC VARCHAR(18));
--    cust_R CustR;
--    CURSOR custCR IS
--    SELECT Cust_ID, CustFirstName, CustLastName,CustCity
--    FROM PCustomer;
--BEGIN
--
--    OPEN custCR;
--    LOOP
--        FETCH custCR INTO cust_R;
--        EXIT WHEN custCR%NOTFOUND;
--        CASE cust_R.CustC
--        WHEN 'Montreal' THEN
--              INSERT INTO PCustomerEast(Cust_ID,CustName,CustCity) VALUES ('Cu-'||TO_CHAR(cust_R.Custid),cust_R.CustFN||' '||cust_R.CustLN, cust_R.CustC);
--        WHEN 'Vancouver' THEN
--            INSERT INTO PCustomerWest(Cust_ID,CustName,CustCity) VALUES ('Cu-'||TO_CHAR(cust_R.Custid),cust_R.CustFN||' '||cust_R.CustLN, cust_R.CustC);
--        ELSE
--            DBMS_OUTPUT.PUT_LINE('Neither city, not allocated');
--        END CASE;
--    END LOOP;
--    CLOSE custCR;
--END;

--set SERVEROUTPUT on;
--create or replace PROCEDURE CalculateAverageSalary( p_average_salary OUT NUMBER)
--AS
--BEGIN
--SELECT AVG(salary)
--INTO p_average_salary
--FROM hr.employees;
---- Displaying the calculated average salary
--DBMS_OUTPUT.PUT_LINE('Average Salary: ' || p_average_salary);
--END CalculateAverageSalary;
--/
--declare
--v_avg_salary number;
--
--
--begin
--CalculateAverageSalary(v_avg_salary);
--END;


--DROP TABLE MyCustomer;
--CREATE TABLE MyCustomer
--AS
--SELECT * FROM sh.Customers
--WHERE 1 = 2;
--CREATE OR REPLACE PROCEDURE Bulk_Insert
--IS
--TYPE tbltp IS TABLE OF MyCustomer%ROWTYPE;
--l_tbl tbltp;
--BEGIN
--SELECT * BULK COLLECT INTO l_tbl
--FROM sh.Customers;
--FORALL i IN 1..l_tbl.LAST
--INSERT INTO MyCustomer VALUES l_tbl(i);
--COMMIT;
--END;
--/
--SELECT COUNT(*) FROM MyCustomer
--
--EXECUTE Bulk_Insert();
--
--SELECT COUNT(*) FROM MyCustomer
--DROP TABLE MyCustomer;


CREATE TABLE MyCustomer
AS
SELECT * FROM sh.customers;
CREATE OR REPLACE FUNCTION Credit_Format(v_cred_limit IN NUMBER)RETURN VARCHAR2
IS
BEGIN
    RETURN 'CAD $'||TO_CHAR(v_cred_limit);
END;
/
DECLARE
    v_formatted varchar2(50);
BEGIN
    v_formatted := Credit_Format(33.2);
    DBMS_OUTPUT.PUT_LINE(v_formatted);
END;

