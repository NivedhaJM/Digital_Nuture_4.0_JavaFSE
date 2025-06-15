--create a table with the following: 

CREATE TABLE LOANS (
  LOAN_ID      NUMBER PRIMARY KEY,
  CUSTOMER_ID  NUMBER,
  AMOUNT       NUMBER(12,2),
  DUE_DATE     DATE
);

--insert values into the table, according to the requirements.

--a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.

BEGIN
  FOR loan_rec IN (
    SELECT CUSTOMER_ID, LOAN_ID, DUE_DATE
    FROM LOANS
    WHERE DUE_DATE BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.LOAN_ID ||
                         ' for Customer ID ' || loan_rec.CUSTOMER_ID ||
                         ' is due on ' || TO_CHAR(loan_rec.DUE_DATE, 'DD-MON-YYYY'));
  END LOOP;
END;
/
