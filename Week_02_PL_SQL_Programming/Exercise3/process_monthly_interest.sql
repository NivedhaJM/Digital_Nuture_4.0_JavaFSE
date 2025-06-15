--create a table with the following: 

CREATE TABLE ACCOUNTS (
  ACCOUNT_ID    NUMBER PRIMARY KEY,
  CUSTOMER_ID   NUMBER,
  ACCOUNT_TYPE  VARCHAR2(20),
  BALANCE       NUMBER(12,2)
);

--insert values into the table, according to the requirements.

-- a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE ACCOUNTS
  SET BALANCE = BALANCE + (BALANCE * 0.01)
  WHERE ACCOUNT_TYPE = 'SAVINGS';

  COMMIT;
END;
/
