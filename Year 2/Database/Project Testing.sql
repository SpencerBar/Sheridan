SET SERVEROUTPUT on;
--testing add update and delete

DECLARE
add1 NUMBER;
add2 NUMBER;
add3 NUMBER;
 BEGIN
 
    add1:= addCust('Spencer', 'Barnes', '2892596490', TO_DATE('12-08-1993', 'MM-DD-YYYY'), 345828222, 'ACTIVE','SB');
    add2:= addCust('Jeffrey', 'Pollock', '2892596490', TO_DATE('04-27-1993', 'MM-DD-YYYY'), 231231221, 'ACTIVE','JP' );
    add3:= addCust('Alyafei', 'Ahmed', '2892596490', TO_DATE('09-04-2000', 'MM-DD-YYYY'), 331231221, 'INACTIVE','AA');
    
    updateCust(add3, 'STATUS', 'ACTIVE');
    deleteCUST(add1);

END;
/
select * from leader1.customer_list;
/

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
/

SELECT "Title", "Price", "ID"
FROM
(SELECT ROW_NUMBER() OVER (ORDER BY Price ASC NULLS LAST) AS "ID", Title as "Title", Price as "Price"
FROM
Leader1.DVDS)
WHERE "ID" IN (3,4)
ORDER BY "Price" DESC NULLS LAST;
/

--testing customer history

DECLARE
BEGIN
CUST_MOVIE_HIST();
END;
/
--testing price diff
DECLARE 
BEGIN
PRICE_DIFF();
END;

-- testing cumulative total
DECLARE 
BEGIN
CUM_TOTAL();
END;

/

