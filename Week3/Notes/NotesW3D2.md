# Notes W3D2

### Structured Query Language

- What is SQL?
    - Structured query language
    - Manipulates databases
    - American National Standards Institute (ANSI) Standardard
    - 
- Actions:
    - Execute queries
    - Retrieve data
    - Insert records
    - Update records
    - Create dbs
    - etc

- There are multiple versions, but all Versions Accept:
    - `SELECT`
    - `UPDATE`
    - `DELETE`
    - `INSERT`
    - `WHERE`

- ex1:
```sql
//create a database

CREATE DATABASE pets;

//shows the database
SHOW DATABASES;

//use the appropriate database
USE DATABASE pets;


//creates a table to add to
CREATE TABLE cats (
    id unsigned NOT NULL AUTO_INCREMENT,
    name VARCHAR(!50),
    owner VARCHAR(!50),
    birth DATE NOT NULL,
    PRIMARY KEY (id)
);

//describes the table
DESCRIBE cats;

//INSERT INTO cats (
    name,
    owner,
    birth
)
 
 VALUES (
    'Rosie',
    'Leah Kochevar',
    '2015, 02, 04'
 ));

//check that the element is added
SELECT * FROM cats;
```
