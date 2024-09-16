--set serveroutput on;
--DECLARE
--    price NUMBER(10,2):= 100.99;
--    discount NUMBER;
--    discPrice NUMBER (10,2);
--BEGIN
--    discount := '&tDiscount';
--    dbms_output.put_line('Enter a Discount(eg .20 for 20%): ' || discount);
--    discPrice := price * (1 - discount);
--    dbms_output.put_line(discPrice);
--END;
--/

--DECLARE
--simple_interest NUMBER;
--principal NUMBER;
--rate NUMBER;
--time NUMBER;
--BEGIN
--principal := &tPrincipal;
--dbms_output.put_line('Enter a Principal(XXX.XX): ' || principal);
--rate := &tRate;
--dbms_output.put_line('Enter a Rate(%): ' || rate);
--time := &tTime;
--dbms_output.put_line('Enter a Time(Days): ' || time);
--simple_interest := (principal * rate * time) / 100;
--dbms_output.put_line(simple_interest);
--END;
--/

--DECLARE
--l_num SIMPLE_INTEGER := 0;
--BEGIN
--FOR i IN 1 .. 20 LOOP
--l_num := l_num + 1073741824;
--END LOOP;
--DBMS_OUTPUT.PUT_LINE(TO_CHAR(l_num));
--END;
--/

--DECLARE
--BEGIN
--    FOR num IN 1..100 LOOP
--            IF MOD(num, 2) = 1 THEN
--                dbms_output.put_line(num);
--            END IF;
--    END LOOP;
--END;
--/

--SET SERVEROUTPUT ON;
--DECLARE
--l_id sh.Customers.Cust_ID%TYPE;
--l_fname sh.Customers.Cust_First_Name%TYPE;
--l_lname sh.Customers.Cust_Last_Name%TYPE;
--CURSOR cr IS SELECT Cust_ID, Cust_First_Name, CUst_Last_Name
--FROM sh.Customers
--WHERE Cust_ID < 100;
--BEGIN
--OPEN cr;
--LOOP
--FETCH cr INTO l_id, l_fname, l_lname;
--EXIT WHEN cr%NOTFOUND;
--DBMS_OUTPUT.PUT_LINE(l_id ||' '||
--l_fname || ' '||
--l_lname);
--
--END LOOP;
--CLOSE cr;
--END;
--/

--DECLARE
--    TYPE Employee IS RECORD
--    (e_id NUMBER,
--    e_fname VARCHAR2(20),
--    e_lname VARCHAR2(20));
--    Employ Employee;
--    CURSOR cr IS SELECT Employee_ID, First_Name, Salary
--        FROM hr.employees
--        WHERE Salary >5000;
--BEGIN
--    OPEN cr;
--    LOOP
--        FETCH cr INTO Employ;
--        EXIT WHEN cr%NOTFOUND;
--        dbms_output.put_line(Employ.e_id || ' ' ||
--                            Employ.e_fname || ' ' ||
--                            Employ.e_lname);
--        
--    END LOOP;
--    CLOSE cr;
--END;
--/


DECLARE
    TYPE Student IS RECORD
        (student_id NUMBER(10),
        course VARCHAR2(20),
        grade NUMBER(3));
    TYPE Students IS TABLE OF Student;
    Stud75 Students;
    CURSOR cr IS SELECT Student_ID, Course_ID, Grade
        FROM sh.students
        WHERE Grade > 75;
BEGIN
    OPEN cr;  
    FETCH cr BULK COLLECT INTO Stud75;
    CLOSE cr;
        FOR i IN 1..Stud75.LAST LOOP
            dbms_output.put_line
                (student_id || ' ' ||
                course || ' ' || 
                grade || ' ');
    END LOOP;
END;
/
