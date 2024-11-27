SET SERVEROUTPUT ON;
--SECTION B - Question 1 - completed by Spencer Barnes
CREATE TABLE myemployees AS
SELECT * FROM HR.employees;
DECLARE
--creating emp_ID and emp_Rating
    emp_ID myemployees.employee_id%TYPE;
    emp_Rating Employee_performance_rating.performance_rating%TYPE;
--   instance of emp_Rating_Table
    CURSOR emp_Cursor IS
    SELECT employee_id, performance_rating
    FROM Employee_performance_rating;
--    creating a cursor of the employees
BEGIN
    OPEN emp_Cursor;
    LOOP
--    Fetch cursor data into 
    FETCH emp_Cursor INTO emp_ID, emp_Rating;
    EXIT WHEN emp_Cursor%NOTFOUND;
        IF emp_Rating = 'high' THEN
            UPDATE myemployees
            SET salary = salary * 1.05
            WHERE employee_id = emp_ID;
        END IF;
    END LOOP;   
END;
/

--SECTION B - Question 2 - completed by Spencer Barnes
--CREATE TABLE Assignment_Products AS
--SELECT * FROM SH.Products
--WHERE 1=0;

CREATE OR REPLACE PROCEDURE InsertProducts IS
--creating a collection of rows of SH.Products%ROWTYPE
    TYPE product_Table IS TABLE OF SH.Products%ROWTYPE;
    product_Collection product_Table;
    
--creating a cursor of SH.Products
    CURSOR product_Cursor IS
    SELECT * FROM SH.Products; 
BEGIN
    OPEN product_Cursor;
--   pulling values into product collection
    FETCH product_Cursor BULK COLLECT INTO product_Collection;
    CLOSE product_Cursor;
    FORALL i IN 1..product_Collection.LAST
--    populating assignment products with the values from product collection
        INSERT INTO Assignment_Products VALUES product_Collection(i);
END;
/
--CREATE OR REPLACE PROCEDURE UpdateMinPrice
--AS
--BEGIN
--UPDATE Assignment_Product
--SET Prod_Min_price = Prod_Min_price + 200;
--END;

--Use a function to update the column Prod_Min_price and increment the values by 200 dollars.
CREATE OR REPLACE FUNCTION UpdateProdMinPrice RETURN NUMBER AS
   NumUpdated NUMBER;
BEGIN
-- update the table
    UPDATE Assignment_Products
    SET Prod_Min_price = Prod_Min_price + 200;
-- Get the number of rows affected
   NumUpdated := SQL%ROWCOUNT;

-- Return the number of updated rows
    RETURN NumUpdated;
END;
/

CREATE OR REPLACE PROCEDURE UpdateStatus AS
    updatedCount NUMBER;
BEGIN
    UPDATE Assignment_Products
    SET Prod_Status = 'Inactive'
    WHERE Prod_List_Price < 50;
    updatedCount := SQL%ROWCOUNT;
    DBMS_OUTPUT.PUT_LINE('Number of rows updated: ' || updatedCount);
END;
/
DECLARE
updatedCount NUMBER;
BEGIN
    InsertProducts(); 
   updatedCount :=  UpdateProdMinPrice();
   UpdateStatus();
END;
/

--SECTION B - Question 2 - completed by Spencer Barnes
DECLARE
-- here is as a record 
    TYPE job_rec IS RECORD(
    job_id VARCHAR2(100),
    job_title VARCHAR2(100),
    min_salary NUMBER,
    max_salary NUMBER
    );
    job job_rec;

-- declare a cursor to select jobs with max_salary > 10,000
    CURSOR job_cursor IS
        SELECT *
        FROM HR.jobs
        WHERE max_salary > 10000;
BEGIN
   OPEN job_cursor;
    LOOP
        FETCH job_cursor INTO job;
        EXIT WHEN job_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Job ID: ' || job.job_id || ', Job Title: ' || job.job_title);
    END LOOP;
    CLOSE job_cursor;
END;
/


