--create a table with the following: 

CREATE TABLE CUSTOMERS (
  CUSTOMER_ID        NUMBER PRIMARY KEY,
  NAME               VARCHAR2(100),
  AGE                NUMBER,
  LOAN_INTEREST_RATE NUMBER(5,2)
);

--insert values into the table, according to the requirements.

--a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.

BEGIN
  FOR cust IN (
    SELECT CUSTOMER_ID, AGE, LOAN_INTEREST_RATE
    FROM CUSTOMERS
    WHERE AGE > 60
  ) LOOP
    UPDATE CUSTOMERS
    SET LOAN_INTEREST_RATE = LOAN_INTEREST_RATE - 1
    WHERE CUSTOMER_ID = cust.CUSTOMER_ID;
  END LOOP;

  COMMIT;
END;
/
