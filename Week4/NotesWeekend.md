# Notes W4Weekend

- DDL = Data  Definition Language //defining the data
    - `CREATE`
        - creates database or table
    - `DROP`
        - drops database or table
    - `ALTER`
        - alters table
    - `TRUNCATE`
        - removes all elements from table while leaving the structure
    - `COMMENT`
        - adds comment to row
    - `RENAME`
- DQL = Data Query Language //querying the data
    - `SELECT`
- DML = Data Manipulation Language //manipulating the data
    - `INSERT`
        - adds row to table
    - `UPDATE`
        - updates a row in the table
    - `DELETE`
        - removes a row in the table
    - `LOCK`
        - table control concurrency
            - concurrency means multiple people are accessing the table at the same time
- DCL = Data Control Language //controls privileges 
    - `GRANT`
        - Grants access to DB
    - `REVOKE`
        - Withdraws access to DB
- TCL = Transfer Control Language
    - `COMMIT`
        - commits a transaction
    - `ROLLBACK`
        - rollbacks a transaction
    - `SAVEPOINT`
        - sets a savepoint within a transaction
    - `SET TRANSACTION`
        - specify characteristics for the transation

- Testing for NULL?
    - `IS NOT NULL`

- INSANELY LARGE DB?
    - Use `LIMIT` in MYSQL (toward the end of query)
    - Use `TOP` in other languages (toward the start of query)

- `AUTOCOMMIT`
    - enabled by default in MySQL