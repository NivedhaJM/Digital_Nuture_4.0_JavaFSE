--create a table with the following: 

CREATE TABLE CUSTOMERS (
  CUSTOMER_ID     NUMBER PRIMARY KEY,
  NAME            VARCHAR2(100),
  AGE             NUMBER,
  BALANCE         NUMBER(12,2),
  ISVIP           VARCHAR2(5) DEFAULT 'FALSE'
);

--insert values into the table, according to the requirements.

--a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000

BEGIN
  FOR cust IN (
    SELECT CUSTOMER_ID
    FROM CUSTOMERS
    WHERE BALANCE > 10000
  ) LOOP
    UPDATE CUSTOMERS
    SET ISVIP = 'TRUE'
    WHERE CUSTOMER_ID = cust.CUSTOMER_ID;
  END LOOP;

  COMMIT;
END;
/
