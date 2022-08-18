# Bank 
## Description The Bank app is a console-based application that simulates banking operations. 
A customer can apply for an account, view their balance, and make withdrawals and deposits. 
An employee can aprove or deny accounts and view account balances for their customers. 

## Purpose We want to see that you can meet deadlines and that you can code. 
You are expected to complete the following requirements and give a 5 minute presentation of your project to our QC team. 

## Requirements 
1. Functionality should reflect the below user stories. 
2. Data is stored in a database. 
3. A custom stored procedure is called to perform some portion of the functionality. 
4. Data Access is performed through the use of JDBC in a data layer consisting of Data Access Objects. 
5. All input is received using the java.util.Scanner class. 
6. Log4j is implemented to log events to a file. 
7. A minimum of one (1) JUnit test is written to test some functionality. 

## User Stories 
* 1As a user, I can login. ✅
* 2As a customer, I can apply for a new bank account with a starting balance. ✅
* 3As a customer, I can view the balance of a specific account. ✅
* 4As a customer, I can make a withdrawal or deposit to a specific account. ✅
* 5As the system, I reject invalid transactions. ✅
* 6Ex: * A withdrawal that would result in a negative balance. ✅
* 7A deposit or withdrawal of negative money. ✅
* 9As an employee, I can approve or reject an account. ✅
* 10As an employee, I can view a customer's bank accounts. ✅
* 11As a user, I can register for a customer account. ✅
* 12As a customer, I can post a money transfer to another account. ✅
* 13As a customer, I can accept a money transfer from another account. ✅
* 14A an employee, I can view a log of all transactions.

5/15

---

# TODO:

### Config

- ?

### Classes

- **User**
   
    - [x]Can login
    - [x]Can logout
    - []Create Accounts
    - []Delete Accounts
    - [x]Select An Account

- **Account**
   
    - [x]Deposit
    - [x]Withdraw
    - [x]Check Account
    - []Send Money
    - []Accept Motney
    - []View All Transactions
    - []Transfer to Connected Account
    
- ***Employee***

    - [x]Credentials
        - [x]username
        - [x]password
    - []Perform Transactions
    - []View All Accounts
        - []See Queue
    - []Open Account for Customer
        - []Create Account
        - []Save Date Registered
    - []Reject Account
        - []Reject Item in Queue
        - []Save Date Rejected
    - []Close Account
        - []Remove Account
        - []Save Date Closed
        - []Active Boolean to False

- ***Dao***
    
    - []set all functions for database
        - []get account balance
        - []deposit
        - []withdraw
        - []transfer
        - []validate withdraw
        - []validate deposit
        - []validate transfer

- ***DAO IMPL***

    - []Implement all dao functions

-  ***"UI" Layer:***
    - []Console Interaction Class
    - []Select Employee or Customer
    - []ConsoleLoginInterface()
        - Methods:
            - []setUserType()
                - []Take Byte
            - []getUserType()
                - []Take Byte
    - []ConsoleLoginImpl()

- ***Candidate:***
    - [x]Variables:
        - [x]firstName
        - [x]lastName
        - [x]middleName
        - [x]social
        - [x]dateOfBirth
        - [x]address
        - [x]zipCode
        - [x]email
        - [x]phoneNumber
        - [x]username
        - [x]accountType
    - []Functions
        - [x] set first name
        - [x] set last name
        - [x] set middle name
        - [x] set social
        - [x] set date of birth
        - [x] set address
        - [x] set zip code
        - [x] set email
        - [x] set phone number
        - [x] set username
        - [x] set account type
        - [] generate form
            - []ask for all required data
    - [x] REGEX form validation
    
- ***Formatter:***
    - [x]Methods:
        - [x]validateName
        - [x]validateSocial
        - [x]validateDateOfBirth
        - [x]validateAddress
        - [x]validateZip
        - [x]validateEmail
        - [x]validatePhone
        - [x]validateUsername
    
### Database

- [x]MySQL
- [x]DATABASE cowherd_bank
    - [x]TABLE employee
        - [x]first_name
            - Nire
        - [x]last_name
            - Letiv
        - [x]middle_name
            - NULL
        - [x]department
            - Investment Management and Accounts
        - [x]job_title
            - Admin
        - [x]date_of_birth
            - 01-28-2004
        - [x]social 
            - 999-99-9999
        - [x]zip_code
        - [x]branch_location
        - [x]hire_date
        - [x]phone_number
        - [x]email
        - [x]employee_id
            - 9999
        - [x]salary
    []TABLE candidate
        - []firstName
        - []lastName
        - []middleName
        - []social
        - []dateOfBirth
        - []address
        - []zipCode
        - []email
        - []phoneNumber
        - []username
        - []accountType

### Error Safety

- []Account
    - []Prevent overdraw
    - []Prevent SQL Injection
    - []Protect Passwords
    - []Prevent invalid entries (such as negative money deposit)
- []Login
    - [x]InputMismatchException for Cust/Emp/Sign choice
- []SignUp
    - []Prevent duplicate candidates and clients from being generated

# References

### Regex

- https://onlinehelp.opswat.com/dlp/1.3_Sample_regular_expressions.html
- https://mkyong.com/regular-expressions/how-to-validate-username-with-regular-expression/
