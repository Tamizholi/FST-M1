REM   Script: Activity5
REM   update command to Salesman Table

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

select salesman_id, salesman_city from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city='paris';

select salesman_id, commission from salesman where salesman_name='Paul Adam';

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city='paris';

select salesman_id, commission from salesman where salesman_name='Paul Adam';

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city='Paris';

select salesman_id, commission from salesman where salesman_name='Paul Adam';

ALTER TABLE salesman add grade int;

update salesman set grade=100;

select * from salesman;

select * from salesman;

update salesman set grade= 200 where salesman_city='Rome';

update salesman set grade=300 where salesman_name='James Hoog';

update salesman set salesman_name='Pierre' where salesman_name='McLyon';

select * from salesman;

