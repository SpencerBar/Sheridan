SET SERVEROUTPUT on;
DROP FUNCTION addCUST;
DROP PROCEDURE updateCUST;
DROP PROCEDURE deleteCUST;

/


CREATE OR REPLACE FUNCTION addCUST(
    firstName IN VARCHAR2,
    lastName IN VARCHAR2,
    phoneNumber IN VARCHAR2,
    birthDate IN DATE,
    driversLicenseNumber IN NUMBER,
    status IN VARCHAR2,
    CustomerID IN VARCHAR2
)RETURN NUMBER
IS 
    sql_stmt VARCHAR2(4000);
    generated_custno NUMBER;
BEGIN
--    using dynamic sql to insert new customer
    sql_stmt := 'INSERT INTO Leader1.Customer_List(FIRSTNAME, LASTNAME, PHONENUMBER, BIRTHDATE, DRIVERSLICENSENUMBER, STATUS, CUSTOMERID)
                 VALUES (:1, :2, :3, :4, :5, :6, :7)
                 RETURNING CUSTNO INTO :8';

--executing using the passed in variables and retrieving the generated customer number
    EXECUTE IMMEDIATE sql_stmt USING firstName, lastName, phoneNumber, birthDate, driversLicenseNumber, status, CustomerID, OUT generated_custNo;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer No ' || generated_custno || ' added successfully!');
    
    RETURN generated_custno;

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error occurred: ' || SQLERRM);
        RETURN NULL;

END;
/

-- additional method that is just procedure, but is less useful than function because it doesnt pass back the custNo, could be useful for bulk inserts though

--CREATE OR REPLACE PROCEDURE addCUST(firstName IN VARCHAR2, lastName IN VARCHAR2,
--phoneNumber IN VARCHAR2, birthDate IN DATE, driversLicenseNumber IN NUMBER, status IN VARCHAR2, CustomerID IN VARCHAR2)
--IS 
--
--sql_stmt VARCHAR2(4000);
-- 
--BEGIN
--    sql_stmt := 'INSERT INTO Leader1.Customer_List(
--      FIRSTNAME, LASTNAME, PHONENUMBER, BIRTHDATE, DRIVERSLICENSENUMBER, STATUS,CUSTOMERID)
--    VALUES (:1, :2, :3, :4, :5, :6, :7)' ;
--  
--    EXECUTE IMMEDIATE sql_stmt USING  firstName, lastName, phoneNumber, birthDate, driversLicenseNumber, status,CustomerID;
--    DBMS_OUTPUT.PUT_LINE( 'Customer No' || || added successfully!');
--    EXCEPTION
--        WHEN OTHERS THEN
--            DBMS_OUTPUT.PUT_LINE('Error occurred: ' || SQLERRM);
--END;
--/

-- creating updateCust using only the custNo, the column name you want to edit and the new value for that column
CREATE OR REPLACE PROCEDURE updateCUST(custNo IN NUMBER,colName IN VARCHAR2, newVal  IN VARCHAR2) IS
    sql_stmt VARCHAR2(4000);
BEGIN

--using dynamic sql to update the customerlist table

    sql_stmt := 'UPDATE Leader1.Customer_List SET ' || colName || ' = :1 WHERE CUSTNO = :2';
    EXECUTE IMMEDIATE sql_stmt USING newVal, custNo;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer updated successfully!');
    
    EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error occurred: ' || SQLERRM);
        ROLLBACK;
    
END;
/

-- creating the deleteCust procedure, it only needs the primary key to delete
CREATE OR REPLACE PROCEDURE deleteCUST(CUSTNO IN NUMBER) 
IS
    sql_stmt VARCHAR2(4000);
BEGIN

--more dynamic sql
    sql_stmt := 'DELETE FROM Leader1.Customer_List WHERE CUSTNO = :1';
    EXECUTE IMMEDIATE sql_stmt USING CUSTNO;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer with CUSTNO ' || CUSTNO || ' deleted successfully!');
    
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error occurred: ' || SQLERRM);
        ROLLBACK;
END;
/
COMMIT;
/

--selecting customers and the dvd they rented and sorting it by dvd cost in a dense rank
SELECT c.FirstName || ' ' || c.LastName AS "Name", 
    d.Title as "Title", d.Price as "Price", 
DENSE_RANK() OVER (ORDER BY d.Price) AS "Rank"
FROM
leader1.CUSTOMER_LIST c
INNER JOIN leader1.DVD_RENTAL dr
ON dr.CUSTOMERID = c.CUSTOMERID
INNER JOIN leader1.DVDS d
ON d.TAPEID = dr.TAPEID
ORDER BY d.Price ASC NULLS LAST;

--selecting the 3rd and 4th highest price 
SELECT "Title", "Price", "ID"
FROM
(SELECT ROW_NUMBER() OVER (ORDER BY Price ASC NULLS LAST) AS "ID", Title as "Title", Price as "Price"
FROM
Leader1.DVDS)
WHERE "ID" IN (3,4)
ORDER BY "Price" DESC NULLS LAST;


-- creating custmoviehist procedure
CREATE OR REPLACE PROCEDURE CUST_MOVIE_HIST
IS
BEGIN
    FOR rec IN (
        SELECT 
            CASE 
--            grouping helps replace nulls with totals for readability
                WHEN GROUPING(c.FirstName) = 1 AND GROUPING(c.LastName) = 1 AND GROUPING(d.Title) = 0 THEN 'Movie Total'
                WHEN GROUPING(c.FirstName) = 1 AND GROUPING(c.LastName) = 1 THEN 'Customer Total'
                WHEN GROUPING(d.Title) = 1 THEN 'Grand Total'
                ELSE c.FirstName || ' ' || c.LastName
            END AS "Customer/Movie",
            d.Title AS "Movie Name",
            COUNT(*) AS "Number of Rentals"
        FROM 
            leader1.CUSTOMER_LIST c
        INNER JOIN leader1.DVD_RENTAL dr
            ON dr.CUSTOMERID = c.CUSTOMERID AND dr.custNo = c.custNo
        INNER JOIN leader1.DVDS d
            ON d.TAPEID = dr.TAPEID
        GROUP BY CUBE((c.FirstName, c.LastName), d.Title)
        ORDER BY 
            GROUPING(c.FirstName), 
            c.FirstName, 
            c.LastName, 
            GROUPING(d.Title), 
            d.Title
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Customer/Movie: ' || rec."Customer/Movie" || 
                             ', Movie Name: ' || rec."Movie Name" || 
                             ', Number of Rentals: ' || rec."Number of Rentals");
    END LOOP;
END;
/
commit;/
-- finding price differences between a given movie and the average
CREATE OR REPLACE PROCEDURE PRICE_DIFF
AS
BEGIN
--for each record in the select
    FOR REC IN (
        SELECT Title AS "Title", 
               Price AS "Price", 
--               finding the difference
               ROUND(Price - AVG(Price) OVER (), 2) AS "Difference"
        FROM Leader1.DVDS
    ) LOOP
--   printing output       
    DBMS_OUTPUT.PUT_LINE('Title: ' || rec.Title || ', Price: ' || rec.Price || ', Difference: ' || rec.Difference);
    END LOOP;
END;
Commit;
/

--creating cumulative total

CREATE OR REPLACE PROCEDURE CUM_TOTAL
AS
BEGIN
    FOR REC IN (
    SELECT
        c.FirstName AS "Renter",
        d.Title AS "Movie Title",
        d.Price as "Price",
--        this sums the price of every preceeding and current row
        SUM(d.Price) OVER (ORDER BY dr.RentalDate ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) as "Cumulative Price"
    FROM
--  need to join dvdrental as it contains both custno/id and tapeid  
        Leader1.CUSTOMER_LIST c
    INNER JOIN
        Leader1.DVD_RENTAL dr ON dr.CUSTOMERID = c.CUSTOMERID AND dr.CustNo = c.custNo
    INNER JOIN
        Leader1.DVDS d ON d.TAPEID = dr.TAPEID
    ORDER BY
        dr.RentalDate, d.Title, c.FirstName
    ) LOOP
    DBMS_OUTPUT.PUT_LINE('Renter: ' || rec."Renter" || ', Movie Title: ' || rec."Movie Title" 
    || ', Price: ' || rec."Price" || ', Cumulative Price ' || rec."Cumulative Price");
    END LOOP;
    END;

/


