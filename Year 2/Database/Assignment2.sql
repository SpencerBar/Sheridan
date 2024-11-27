--SET SERVEROUTPUT ON;
-- 1.
CREATE OR REPLACE VIEW PREFERRED_CUSTOMERS AS
-- Select the rows we want
SELECT CUSTNAME,CUSTSTREET, CUSTCITY, CUSTPROV,BALANCE
-- Subquery to get only the customers we want
FROM (SELECT 
        c.CUSTNAME, c.CUSTSTREET, c.CUSTCITY, c.CUSTPROV, c.BALANCE, c.CUSTNO
        FROM
        SHW.CUSTOMER c
        -- Join sales order on CUSTNO
        LEFT OUTER JOIN SHW.SALESORDER s
        ON c.CUSTNO = s.CUSTNO
        -- Join Invoice on ORDERNO
        LEFT OUTER JOIN SHW.INVOICE i
        ON s.ORDERNO = i.ORDERNO
        WHERE
        --Take only customers who have orders within 2 years and a balance less than 100000
        i.INVDATE >= ADD_MONTHS(SYSDATE, -24) AND c.BALANCE < 100000 AND
        -- Must also have more than one order.
        c.CUSTNO IN (SELECT CUSTNO FROM SHW.SALESORDER so GROUP BY CUSTNO HAVING COUNT(CUSTNO) >1)
        GROUP BY c.CUSTNO, c.CUSTNAME, c.CUSTSTREET, c.CUSTCITY, c.CUSTPROV, c.BALANCE);/
--Displaying the result
SELECT *
FROM
PREFERRED_CUSTOMERS;/
--2.
--Using this to compare for formatting
SELECT REGION_ID, REGION_NAME FROM HR.REGIONS GROUP BY CUBE(REGION_ID, REGION_NAME);/
-- Selecting disctint to remove duplicate null rows.
SELECT DISTINCT * FROM
-- Subquery to get
-- Region_ID heading
(SELECT REGION_ID, NULL AS REGION_NAME
FROM HR.REGIONS
GROUP BY REGION_ID
UNION ALL
-- Region name heading
SELECT NULL AS REGION_ID, REGION_NAME
FROM HR.REGIONS
GROUP BY REGION_NAME
UNION ALL
-- null, null(
SELECT NULL AS REGION_ID, NULL AS REGION_NAME
FROM HR.REGIONS
UNION ALL
-- regionid and regionname
SELECT REGION_ID, REGION_NAME
FROM HR.REGIONS)
ORDER BY 
    CASE 
    -- making sure null, null is on top
        WHEN region_id IS NULL AND region_name IS NULL THEN 0 
    -- moving null region_id and not null region name below null,null
        WHEN region_id IS NULL AND region_name IS NOT NULL THEN 1
    END,
    -- keeping things grouped first by region id THEN
    region_id,
    CASE 
    -- making sure the region_id heading comes first
        WHEN region_id IS NOT NULL AND region_name IS NULL THEN 0 
        ELSE 1 
    END,
    region_name;
--3.
DROP TABLE PROFESSOR;/

-- creating tables, i tried using execute immediate but it wasnt working. not sure why honestly.
CREATE TABLE Professor
(
 ProfessorID INT,
 Name VARCHAR2(100),
 Department VARCHAR2(100),
 Salary NUMBER,
 HireDate DATE
);/

DROP TABLE Department_Salary_Summary;/
CREATE TABLE Department_Salary_Summary (
    Department VARCHAR2(100),
    Quarter VARCHAR2(5),
    TotalSalary NUMBER
  );/
  
DECLARE

-- Define the record structure to hold the department salary data
TYPE department_salary_record IS RECORD (
    Department VARCHAR2(100),
    Quarter VARCHAR2(5),
    TotalSalary NUMBER);

-- Define a collection type to store the records
TYPE department_salary_coll IS TABLE OF department_salary_record;
-- Initializing an instance of department_salary_coll
department_salary department_salary_coll;


-- Cursor to fetch department, quarter, and total salary
CURSOR salary_cursor IS
SELECT Department, 
    Quarter, 
    SUM(Salary) AS TotalSalary
    FROM (
        SELECT 
            Department,
            -- Extract Quarters based on HireDate
            CASE 
                WHEN EXTRACT(MONTH FROM HireDate) BETWEEN 1 AND 3 THEN 'Q1'
                WHEN EXTRACT(MONTH FROM HireDate) BETWEEN 4 AND 6 THEN 'Q2'
                WHEN EXTRACT(MONTH FROM HireDate) BETWEEN 7 AND 9 THEN 'Q3'
                WHEN EXTRACT(MONTH FROM HireDate) BETWEEN 10 AND 12 THEN 'Q4'
            END AS Quarter,
            Salary
        FROM Professor
    )
    -- Rollup Department and Quarter
    GROUP BY ROLLUP(Department, Quarter)
    ORDER BY Department, Quarter;

BEGIN

-- Open the cursor and bulk collect the result into the collection
OPEN salary_cursor;
FETCH salary_cursor BULK COLLECT INTO department_salary;
CLOSE salary_cursor;

-- Loop over the collected data and insert into the new table
FOR i IN 1 .. department_salary.COUNT LOOP
    IF department_salary(i).Quarter IS NULL THEN
        -- Handle NULL quarter as 'Total'
        INSERT INTO Department_Salary_Summary (Department, Quarter, TotalSalary)
        VALUES (department_salary(i).Department, 'Total', department_salary(i).TotalSalary);
    ELSE
        -- Insert department, quarter, and total salary data
        INSERT INTO Department_Salary_Summary (Department, Quarter, TotalSalary)
        VALUES (department_salary(i).Department, department_salary(i).Quarter, department_salary(i).TotalSalary);
    END IF;
END LOOP;

EXCEPTION
    WHEN OTHERS THEN
        -- Handle errors
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
        ROLLBACK;
END;
/

