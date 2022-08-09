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

### MySQL Keys

- Unique Key
    - `UNIQUE` keyword
    - It is a single field that ensures all values that are stored in the columns cannot be duplicates
    - MySQL allows for more than one column with unique constraints
    - Rules:
        - IT's useful when we want a column that cannot have identical values
        - it stores distinct values that maintain integrity and reliability of database
        - it works with foreign keys in preventing the uniqueness of the table (?)
    - Multicolumn keys are allowed; however, you can still add identical keys if the pair isn't identical

```SQL
...UNIQUE KEY some_unique_key (field1, field2)
```
- Primary Key
    - `PRIMARY KEY`
    - used to identify each record in a table uniquely
    - it cannot be null
    - can generate sequential numbers automatically if `AUTO_INCREMENT` is declared 
    - Rules:
- Foreign Key
    - It is used to link one or more than one table together which is known as a...
    - Foreign keys must match the Primary key of another table
    - You must retain referential integrity in your tables
    - Example:
        - //table 1 Below
        - orderID(primarykey)
        - data
        - amount
        - custID (foreignkey)
        - //table 2 Below
        - custID (primarykey)
        - name
        - email
        - phone
        - orderID(foreignkey)

- Composite Key


# JDBC

- Java Databse Connectivity!
- What? An API to connect with DB using Java
    - JDBC-ODBC driver
    - Native driver
    - Network Protocol Driver
    - Thin Driver

- Why JDBC? 
    - Connect to the database!
        - Query DB
        - Update DB
- How?

1. Register Driver
    - `forName()` method of a class which is used to register the driver class
    - `class.forName(oracle.jdbc.driver.OracleDriver)`
2. Create Connection
    - `getConnection()`
    - predefined ->`public static Connection getConnection(STring url, Strign username, String password)`
3. Create the Statemenet Object
    - `createStatement()` method of connection interface is used o create a statement the object of the statement is responsible to execute queries with hte databasae
    - `public statement createStatement`
4. Execute Queries
    - `executeQuery()`
    