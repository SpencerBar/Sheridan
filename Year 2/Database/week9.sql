--select Employee_ID, First_Name, Last_Name, salary,
--CASE
--when salary > 10000 THEN 'High'
--when salary > 6000 and salary <= 10000 THEN 'Medium'
--else 'Low'
--END AS Bracket,
--CASE
--when salary > 10000 THEN 'High'
--when salary > 6000 and salary <= 10000 THEN 'Medium'
--else 'Low'
--END AS B,
--CASE
--when salary > 10000 THEN 'High'
--when salary > 6000 and salary <= 10000 THEN 'Medium'
--else 'Low'
--END AS a,
--CASE
--when salary > 10000 THEN 'High'
--when salary > 6000 and salary <= 10000 THEN 'Medium'
--else 'Low'
--END AS s,
--CASE
--when salary > 10000 THEN 'High'
--when salary > 6000 and salary <= 10000 THEN 'Medium'
--else 'Low'
--END AS e,
--CASE
--when salary > 10000 THEN 'High'
--when salary > 6000 and salary <= 10000 THEN 'Medium'
--else 'Low'
--END AS d
--FROM hr.employees;
--
--CREATE TABLE Activity
--(AID NUMBER(2),
--AClass VARCHAR2(1),
--ASubclass VARCHAR2(2),
--AColor VARCHAR2(6),
--Aname VARCHAR2(1),
--ACost NUMBER(5,2));
INSERT INTO Activity Values(1, 'A','A1','Red','k', 25);
INSERT INTO Activity Values(2, 'A','A2','Red','l', 10);
INSERT INTO Activity Values(3, 'A','A1','Blue','d', 15);
INSERT INTO Activity Values(4, 'A','A2','Blue','f', 5);
INSERT INTO Activity Values(5, 'B','B1','Red','l', 45);
INSERT INTO Activity Values(6, 'B','B2','Red','f', 100);
INSERT INTO Activity Values(7, 'B','B1','Blue','q', 20);
COMMIT;

--
--SELECT COUNT(ACost) AS "Number of Activities",
--MAX(ACost) AS "Maximum Activity Cost",
--MIN(ACost) AS "Minimum Activity Cost",
--AVG(ACost) AS "Average Activity Cost",
--SUM(ACost) AS "Sum of Activity Costs"
--FROM Activity
--GROUP BY Aclass

--
--SELECT Aclass,
--COUNT(ACost) AS "Number of Activities",
--MAX(ACost) AS "Maximum Activity Cost",
--MIN(ACost) AS "Minimum Activity Cost",
--AVG(ACost) AS "Average Activity Cost",
--SUM(ACost) AS "Sum of Activity Costs"
--FROM Activity
--GROUP BY Aclass, acolor
--order by aclass, acolor;

--Grouping by multiple columns

--SELECT Aclass, AColor,
--COUNT(ACost) AS "Number of Activities",
--MAX(ACost) AS "Maximum Activity Cost",
--MIN(ACost) AS "Minimum Activity Cost",
--AVG(ACost) AS "Average Activity Cost",
--SUM(ACost) AS "Sum of Activity Costs"
--FROM Activity
--GROUP BY Aclass, AColor
--Order by Aclass, AColor desc;

--select * from activity


--select j.job_title, d.department_name, avg(salary) 
--from hr.employees e
--inner join hr.departments d on e.department_id = d.department_id
--inner join hr.jobs j on e.job_id = j.job_id
--group by cube(d.department_name, j.job_title);/
--
--
--select avg(salary), extract(Month from hire_date) as month, extract(year from hire_date) as year
--from hr.employees
--group by rollup(extract(Month from hire_date), extract(year from hire_date))
--
--drop table sales
--CREATE TABLE Sales (
--SaleID INT PRIMARY KEY,
--ProductCategory VARCHAR(50),
--ProductType VARCHAR(50),
--Region VARCHAR(50),
--QuantitySold INT,
--SaleAmount DECIMAL(10, 2)
--);
--INSERT INTO Sales VALUES (1, 'Electronics', 'Laptop', 'North', 5, 5000.00);
--INSERT INTO Sales  VALUES(2, 'Electronics', 'Smartphone', 'South', 10, 7500.00);
--INSERT INTO Sales VALUES(3, 'Furniture', 'Chair', 'West', 15, 2250.00);
--INSERT INTO Sales VALUES(4, 'Furniture', 'Table', 'East', 8, 3200.00);
--INSERT INTO Sales  VALUES(5, 'Clothing', 'Shirt', 'North', 20, 1000.00;
--INSERT INTO Sales  VALUES(6, 'Clothing', 'Jeans', 'South', 12, 1800.00);
--INSERT INTO Sales) VALUES(7, 'Electronics', 'Tablet', 'West', 7, 3500.00);
--INSERT INTO Sales VALUES(8, 'Furniture', 'Sofa', 'East', 4, 4000.00);
--INSERT INTO Sales  VALUES(9, 'Clothing', 'Jacket', 'North', 6, 1200.00);
--INSERT INTO Sales VALUES(10, 'Electronics', 'Headphones', 'South', 25, 2500.00);

--select  productcategory, region, count(*) as numberOfSales
--from sales
--group by cube(productcategory,region);

--select case
--when grouping(productCategory) =1 and grouping(region) = 1 THEN 'All regions and Categories'
--when grouping(productCategory) =1 THEN 'All categories ' || Region
--when grouping(region) = 1 then 'All region ' || ProductCategory
--else productCategory || '-' || Region
--end as  "Regions and Categories",
--count(*) as numberOfSales, productcategory, region
--from sales
--group by cube(region, productCategory);

--
--select productCategory, productType, count(*) as SalesAmount
--from sales
--group by rollup(productCategory, ProductType);
--

--select productCategory, productType, region, sum(saleAmount) totalSales
--from sales
--group by grouping sets((productCategory, ProductType),(region));

--create or replace view bramcust as
--select 
--*
--from
--si.customer
--where
--upper(custcity) = 'BRAMPTON'
--ORDER BY custname;

--select * from bramcust

create or replace view sh_cust_sales as 
select
c.*
,srep
