# SQL Syntaxes and Functions (Oracle)

## Overview
### Sub-Languages
- DQL/DRL (Data Query/Retrieval Language)
    - SELECT
    - FROM
    - WHERE
- DML (Data Manipulation Language)
    - INSERT
        ```
        INSERT INTO TNAME
        VALUES(VAL1, VAL2,...);
        ```
        or
        ```
        INSERT INTO TNAME(COL1, COL3,...)
        VALUES(VAL1, VAL3,...)
        ```
    - UPDATE
        ```
        UPDATE TNAME
        SET COL1 = VAL1, COL2 = VAL2, ...
        WHERE CONDITION;
        ``` 
    - DELETE
        ```
        DELETE FROM TNAME
        WHERE CONDITION;
        ```
- TCL (Transaction Control Language)
    - COMMIT
        ```
        COMMIT;
        ```
    - SAVEPOINT
        ```
        SAVEPOINT SAVEPOINT_NAME;
        ```
    - ROLLBACK
        ```
        ROLLBACK;
        ```
        or
        ```
        ROLLBACK TO SAVEPOINT_NAME;
        ```
- DDL (Data Deifinition Language)
    - CREATE
        ```
        CREATE TABLE TNAME(
            COLNAME DATATYPE(SIZE) CONSTRAINTS,
            COLNAME DATATYPE(SIZE) CONSTRAINTS,
            COLNAME DATATYPE(SIZE) CONSTRAINTS,
            ....
        );
        ```
    - ALTER
        - ADD
            ```
            ALTER TABLE TNAME
            ADD COLNAME DATATYPE(SIZE) CONSTRAINTS;
            ```
        - RENAME
            ```
            ALTER TABLE TNAME
            RENAME COLNAME OLD_COL_NAME TO NEW_COL_NAME;
            ```
        - DROP
            ```
            ALTER TABLE TNAME
            DROP COLNAME COLUMN_NAME;
            ```
        - MODIFY
            ```
            ALTER TABLE TNAME
            MODIFY COLNAME DATATYPE(SIZE) CONSTRAINTS;
            ```
    - RENAME
        ```
        RENAME OLD_COL_NAME TO NEW_COL_NAME;
        ```
    - TRUNCATE
        ```
        TRUNCATE TABLE TABLE_NAME;
        ```
    - DROP
        ```
        DROP TABLE TABLE_NAME;
        ```
        - Show Recyclebin:
        ```
        show recyclebin;
        ```
        - Undo The Delete:
        ```
        flashback table TABLE_NAME to before DROP;
        ```
        - Delete The Table From Recyclebin:
        ```
        purge table TABLE_NAME;
        ```
        - Empty Recyclebin:
        ```
        purge recyclebin;
        ```
- DCL (Data Control Language)
    - Permission Granting:
        - User to User : SELECT, INSERT, UPDATE, DELETE
        - Admin to User : CREATE, SELECT, INSERT, UPDATE, DELETE
    - GRANT
        ```
        GRANT PRIVILEGES ON OBJECT TO USER;
        ```
        or
        ```
        GRANT ALL ON OBJECT TO USER;
        ```
    - REVOKE
        ```
        REVOKE PRIVILEGES ON OBJECT FROM USER;
        ```
        or
        ```
        REVOKE ALL ON OBJECT FROM USER;
        ```

### User Creation / Deletion
- User Creation
    ```
    CONN ADMIN;
    CREATE USER USER_NAME IDENTIFIED BY PASSWORD;
    GRANT CONNECT TO USER_NAME;
    GRANT ALL PRIVILEGES TO USER_NAME;
    ```
    - Example: 
    ```
    CONN SYSTEM;
    CREATE USER ABHISEK IDENTIFIED BY OTAKU;
    GRANT CONNECT TO ABHISEK;
    GRANT ALL PRIVILEGES TO ABHISEK;
    ```
- User Deletion
    ```
    CONN ADMIN;
    DROP USER USER_NAME CASCADE;
    ```
    - Example: 
    ```
    CONN SYSTEM;
    DROP USER ABHISEK CASCADE;
    ```

### Joins
- Cross / Cartesian Join
    ```
    SELECT Table1.colName, Table2.colName
    FROM Table1, Table2;
    ```
    or
    ```
    SELECT Table1.colName, Table2.colName
    FROM Table1 CROSS JOIN Table2;
    ```
- Inner Join
    ```
    SELECT Table1.colName, Table2.colName
    FROM Table1 INNER JOIN Table2
    ON Table1.CommonCol = Table2.CommonCol; (=, !=, >, <, <=, >=)
    ```
    or
    ```
    SELECT Table1.colName, Table2.colName
    FROM Table1 JOIN Table2
    ON Table1.CommonCol = Table2.CommonCol; (=, !=, >, <, <=, >=)
    ```
    - Equi Join
        ```
        SELECT Table1.colName, Table2.colName
        FROM Table1, Table2
        ON Table1.CommonCol = Table2.CommonCol;
        ```
    - Self Join
        ```
        SELECT T1.colName, T2.colName
        FROM Table AS T1, Table AS T2
        ON T1.CommonCol = T2.CommonCol;
        ```
- Outer Join
    - Left Join / Left Outer Join
        ```
        SELECT Table1.colName, Table2.colName
        FROM Table1 LEFT JOIN Table2
        ON Table1.CommonCol = Table2.CommonCol;
        ```
    - Right Join / Right Outer Join
        ```
        SELECT Table1.colName, Table2.colName
        FROM Table1 RIGHT JOIN Table2
        ON Table1.CommonCol = Table2.CommonCol;
        ```
    - Full Join / Full Outer Join
        ```
        SELECT Table1.colName, Table2.colName
        FROM Table1 FULL OUTER JOIN Table2
        ON Table1.CommonCol = Table2.CommonCol;
        ```

### Functions
- SINGLE ROW FUNCTIONS
- MULTI ROW FUNCTIONS

### SINGLE ROW FUNCTIONS
#### Number Functions:
    - MOD()
    - POWER()
    - SQRT()
    - ABS()
    - CEIL()
    - FLOOR()
    - ROUND()

#### Character Functions: 
    - LENGTH()
    - UPPER()
    - LOWER()
    - REPLACE()
    - INITCAP()
    - CONCAT()
    - TRIM()
    - SUBSTR()
    - INSTR()

#### Date Functions: 
    - SYSDATE
    - CURRENT_DATE
    - SESSIONTIMEZONE
    - CURRENT_TIMEZONE
    - MONTHS_BETWEEN()

#### Conversion Functions:
    - TO_DATE()
    - TO_CHAR()

### MUTLI ROW FUNCTIONS
    - MAX()
    - MIN()
    - AVG()
    - SUM()
    - COUNT()