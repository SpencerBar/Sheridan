--CREATE TABLE Item
--(I_ID NUMBER(2),
--I_Class VARCHAR2(1),
--I_Subclass VARCHAR2(2),
--I_Color VARCHAR2(6),
--I_name VARCHAR2(1),
--I_Cost NUMBER(5,2),
--I_Price NUMBER(5,2),
--I_ManufactureYear NUMBER(4),
--I_ManufactureDate DATE,
--I_Composition_ID NUMBER(2));
--INSERT INTO Item Values(1, 'A','A1','Red','k', 25, 30, 2014,TO_DATE( '2014-07-01', 'YYYY-MM-DD'),2);
--INSERT INTO Item Values(2, 'A','A2','Red','l', 10, 20, 2014, TO_DATE('2014-07-21', 'YYYY-MM-DD'),5);
--INSERT INTO Item Values(3, 'A','A1','Blue','d',15, 20, 2016, TO_DATE('2016-03-21', 'YYYY-MM-DD'),2);
--INSERT INTO Item Values(4, 'A','A2','Blue','f', 5, 10, 2016, TO_DATE('2016-04-19', 'YYYY-MM-DD'),8);
--INSERT INTO Item Values(5, 'A','A2','Blue','f', 5, 10, 2016, TO_DATE('2016-02-29', 'YYYY-MM-DD'),NULL);
--INSERT INTO Item Values(6, 'B','B1','Red','l', 45, 50, 2017,TO_DATE( '2017-11-12', 'YYYY-MM-DD'),8);
--INSERT INTO Item Values(7, 'B','B2','Red','f', 100, NULL, 2017,TO_DATE('2017-12-06', 'YYYY-MM-DD'),5);
--INSERT INTO Item Values(8, 'B','B1','Blue','q', 25, 20, 2018, TO_DATE('2018-03-21', 'YYYY-MM-DD'),5);
--
--SELECT I_ID, I_Name, I_Color,
--I_Composition_ID, LEVEL
--FROM Item
--START WITH I_ID = 5
--CONNECT BY PRIOR I_ID = I_Composition_ID
--ORDER BY LEVEL, I_ID;

--select employee_id, first_name, last_name, department_id, manager_id,  level
--from hr.employees
--start with first_name = 'Lex' and last_name = 'De Haan'
--connect by prior employee_id = manager_id
--order by  level,  employee_id;/

--select I_ID, i_name, i_cost
--from
--(
--select i_id, i_name, i_cost,
--RANK() OVER (ORDER BY I_cost desc) as costRank
--from item
--)
--WHERE costRank = 2;

-- showing second lowest price category
--select prod_id, prod_name, time_id,  priceRank
--from
--(
--select  p.prod_id, p.prod_name, c.time_id,
--DENSE_RANK() OVER (ORDER BY c.unit_price asc nulls last) as priceRank
--from sh.products p
--inner join sh.costs c on
--c.prod_id = p.prod_id
--)
--where priceRank = 2

-- showing the last 500 orders
--select prod_id, prod_name, time_id
--from
--(
--select  p.prod_id, p.prod_name, c.time_id,
--row_number() OVER (ORDER BY c.time_id desc NULLS LAST) as order_number
--from sh.products p
--inner join sh.costs c on
--c.prod_id = p.prod_id
--)
--where order_number <= 500;

select i_id, i_name, i_cost, 
avg(I_cost) OVER (PARTITION BY I_Class) as costAvg,
i_cost - avg(I_cost) OVER (PARTITION BY I_Class)  as costAvgDiff
from item
commit


