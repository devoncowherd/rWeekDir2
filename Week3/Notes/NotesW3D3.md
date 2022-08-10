
# Notes W3D3

### DriverManager

- `registerDriver(Driver)`
- `deregisterDriver(Driver)`
- `getConnection(url)`
- `getConnection(url,username, password)`

### Connection Interface

- A connection is the session between the java application and database
- The connection interface is a factory of the statement, prepareStatement, and DatabaseMetaData
- Common Methods:
    - `createConnection()`
    - `createConnection(resultSetType, resultSetConcurrency)`
    - `setAuthCommit(boolean : status)` // default true
    -  `commit`
    - `rollback()`
    - `close()`

### Statement Interface

- Provides method to execute queries with the database
- A statement interface is a factory of `resultSet`
- Common Methods:
    - `ResultSet executeQuery(String query)` - is used to execute the selected query and return the object of result`
    - 

### Prepare Interface
- It is a sub interface of Statement
- It is used to execute parameterized query

```sql
INSERT INTO employee VALUES (1,'mark', 'm@gmail.com');
INSERT INTO employee VALUES (?,?,?);
```
- **REMINDER: NEVER DIRECTLY CONCAT USER INPUT INTO SQL!!!!!!!!!**


- We can pass parameters (?) for the value

### Console App using MySQL and JDBC? EXAMPLE BELOW

- Create an Employee class
    - id
    - name
    - email
- Create an employee Data Access Object
    - list all methods within
- Create an EmployeeDaoImpl
    - Implements our DAO
- Create EmployeeDAO Factory
    - This is a class that contains a method and returns Employee Dao interface which decouples interface implementation
- dbConfig.properties
    - This is a file that defines configuration in a simple format
- Connection Factory
    - This is a class responsible for returning connection class object