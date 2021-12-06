REM   Script: Activity2
REM   Insert values to Salesman Table

CREATE TABLE tableName;

CREATE TABLE salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT ALL 
INTO Salesman VALUES (5001 , James Hoog, New York, 15) 
INTO Salesman VALUES (5002 , Nail Knite, Paris, 13) 
INTO Salesman VALUES (5005 , Pit Alex, London, 11) 
INTO Salesman VALUES (5006 , McLyon, Paris, 14) 
INTO Salesman VALUES (5007 , Paul Adam, Rome, 13) 
INTO Salesman VALUES (5003  , Lauson Hen, San Jose, 12);

INSERT ALL 
INTO Salesman VALUES (5001 , James Hoog, New York, 15), 
INTO Salesman VALUES (5002 , Nail Knite, Paris, 13), 
INTO Salesman VALUES (5005 , Pit Alex, London, 11), 
INTO Salesman VALUES (5006 , McLyon, Paris, 14), 
INTO Salesman VALUES (5007 , Paul Adam, Rome, 13), 
INTO Salesman VALUES (5003  , Lauson Hen, San Jose, 12);

INSERT ALL 
INTO Salesman VALUES (5001 , 'James Hoog', 'New York', 15) 
INTO Salesman VALUES (5002 , 'Nail Knite', 'Paris', 13) 
INTO Salesman VALUES (5005 , 'Pit Alex', 'London', 11) 
INTO Salesman VALUES (5006 , 'McLyon', 'Paris', 14) 
INTO Salesman VALUES (5007 , 'Paul Adam', 'Rome', 13) 
INTO Salesman VALUES (5003  , 'Lauson Hen', 'San Jose', 12);

INSERT ALL 
INTO Salesman VALUES (5001 , 'James Hoog', 'New York', 15) 
INTO Salesman VALUES (5002 , 'Nail Knite', 'Paris', 13) 
INTO Salesman VALUES (5005 , 'Pit Alex', 'London', 11) 
INTO Salesman VALUES (5006 , 'McLyon', 'Paris', 14) 
INTO Salesman VALUES (5007 , 'Paul Adam', 'Rome', 13) 
INTO Salesman VALUES (5003  , 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

