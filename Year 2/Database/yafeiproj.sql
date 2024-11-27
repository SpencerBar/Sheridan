
DROP TABLE LEADER3.Fact_DVD_Sales;
DROP TABLE LEADER3.Dim_Title;
DROP TABLE LEADER3.Dim_Category;
DROP TABLE LEADER3.Dim_Year;
DROP TABLE LEADER3.Dim_Rating;


CREATE TABLE LEADER3.Dim_Title (
    TitleKey NUMBER PRIMARY KEY,
    TapeID NUMBER,                 
    Title VARCHAR2(100)
);


CREATE TABLE LEADER3.Dim_Category (
    CategoryKey NUMBER PRIMARY KEY,
    CategoryID NUMBER,
    CategoryName VARCHAR2(50)
);

CREATE TABLE LEADER3.Dim_Year (
    YearKey NUMBER PRIMARY KEY,
    Year NUMBER
);

CREATE TABLE LEADER3.Dim_Rating (
    RatingKey NUMBER PRIMARY KEY,
    Rating VARCHAR2(50)
);


CREATE TABLE LEADER3.Fact_DVD_Sales (
    TitleKey NUMBER,       
    CategoryKey NUMBER,    
    YearKey NUMBER,       
    RatingKey NUMBER,      
    Total_Amount NUMBER(12, 2),
    FOREIGN KEY (TitleKey) REFERENCES LEADER3.Dim_Title (TitleKey),
    FOREIGN KEY (CategoryKey) REFERENCES LEADER3.Dim_Category (CategoryKey),
    FOREIGN KEY (YearKey) REFERENCES LEADER3.Dim_Year (YearKey),
    FOREIGN KEY (RatingKey) REFERENCES LEADER3.Dim_Rating (RatingKey)
);





INSERT INTO LEADER3.Dim_Title (TitleKey, TapeID, Title)
SELECT ROW_NUMBER() OVER (ORDER BY TAPEID) AS TitleKey,
       TAPEID,
       TITLE
FROM LEADER1.DVDS
GROUP BY TAPEID, TITLE;


INSERT INTO LEADER3.Dim_Category (CategoryKey, CategoryID, CategoryName)
SELECT ROW_NUMBER() OVER (ORDER BY h.CATEGORYID) AS CategoryKey,
       h.CATEGORYID,
       i.CATEGORYNAME
FROM LEADER1.DVDS h
JOIN LEADER1.MOVIE_CATEGORY i ON h.CATEGORYID = i.CATEGORYID
GROUP BY h.CATEGORYID, i.CATEGORYNAME;



INSERT INTO LEADER3.Dim_Year (YearKey, Year)
SELECT ROW_NUMBER() OVER (ORDER BY RELEASE_YEAR) AS YearKey,
       RELEASE_YEAR
FROM LEADER1.DVDS
GROUP BY RELEASE_YEAR;


INSERT INTO LEADER3.Dim_Rating (RatingKey, Rating)
SELECT ROW_NUMBER() OVER (ORDER BY RATING) AS RatingKey,
       RATING
FROM LEADER1.DVDS
GROUP BY RATING;


DECLARE
    CURSOR dvd_cursor IS
        SELECT TAPEID, CATEGORYID, RELEASE_YEAR, RATING, SUM(PRICE) AS TOTAL_AMOUNT
        FROM LEADER1.DVDS
        GROUP BY TAPEID, CATEGORYID, RELEASE_YEAR, RATING;

    v_TapeID LEADER1.DVDS.TAPEID%TYPE;
    v_CategoryID LEADER1.DVDS.CATEGORYID%TYPE;
    v_Year LEADER1.DVDS.RELEASE_YEAR%TYPE;
    v_Rating LEADER1.DVDS.RATING%TYPE;
    v_Total_Amount NUMBER(12,2);

    v_TitleKey NUMBER;
    v_CategoryKey NUMBER;
    v_YearKey NUMBER;
    v_RatingKey NUMBER;
BEGIN
    
    OPEN dvd_cursor;

   
    LOOP
        FETCH dvd_cursor INTO v_TapeID, v_CategoryID, v_Year, v_Rating, v_Total_Amount;
        EXIT WHEN dvd_cursor%NOTFOUND;

       
        SELECT TitleKey INTO v_TitleKey FROM LEADER3.Dim_Title WHERE TapeID = v_TapeID;
        SELECT CategoryKey INTO v_CategoryKey FROM LEADER3.Dim_Category WHERE CategoryID = v_CategoryID;
        SELECT YearKey INTO v_YearKey FROM LEADER3.Dim_Year WHERE Year = v_Year;
        SELECT RatingKey INTO v_RatingKey FROM LEADER3.Dim_Rating WHERE Rating = v_Rating;

  
        INSERT INTO LEADER3.Fact_DVD_Sales (TitleKey, CategoryKey, YearKey, RatingKey, Total_Amount)
        VALUES (v_TitleKey, v_CategoryKey, v_YearKey, v_RatingKey, v_Total_Amount);
    END LOOP;

    CLOSE dvd_cursor;
END;

SELECT 
    TitleKey,
    CategoryKey,
    YearKey,
    RatingKey,
    SUM(Total_Amount) AS Total_Cost
FROM 
    LEADER3.Fact_DVD_Sales
GROUP BY 
   Cube (TitleKey, CategoryKey, YearKey, RatingKey);

    
    SELECT * FROM LEADER3.Dim_Rating;
    
    SELECT * FROM LEADER3.Dim_Title;
    
    SELECT * FROM LEADER3.Dim_Category;
    
    SELECT * FROM LEADER3.Dim_Year;


