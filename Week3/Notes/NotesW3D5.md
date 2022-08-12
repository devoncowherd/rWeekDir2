# NOTES W3D5

### UNION

- Used to combine the result of two or more tables in a query
```sql
CREATE DATABASE demo;
USE demo;
CREATE TABLE employee_usa(id integer, name char(50),email char(50));
CREATE TABLE employee_canada(id integer, name char(50),email char(50));
INSERT INTO employee_usa(id,name,email) VALUES(1, 'Mark', 'm@gmail.com');
INSERT INTO employee_usa(id,name,email) VALUES(2, 'Caitlyn','c@gmail.com');
INSERT INTO employee_usa(id,name,email) VALUES(3,'Jinx', 'j@gmail.com');
INSERT INTO employee_usa(id,name,email) VALUES(1,'Mark','m@gmail.com');
INSERT INTO employee_canada(id,name,email) VALUES(2, 'Vi', 'v@gmail.com');
```



### JOIN

- Used with a select statement to fetch the record from 2 or more tables
- Types of JOIN
    - inner = simple join
        - used to return all the rows from multiple tables wherever a join statement is satisfied (most common)
    - left outer = left join
    
    - right outer = right join


