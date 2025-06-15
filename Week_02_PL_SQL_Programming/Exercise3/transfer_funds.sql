--create a table with the following: 

CREATE TABLE ACCOUNTS (
  ACCOUNT_ID    NUMBER PRIMARY KEY,
  CUSTOMER_ID   NUMBER,
  ACCOUNT_TYPE  VARCHAR2(20),
  BALANCE       NUMBER(12,2)
);

--insert values into the table, according to the requirements.

-- a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.

CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account_id IN NUMBER,
  p_to_account_id   IN NUMBER,
  p_amount          IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Check if source account has sufficient balance
  SELECT BALANCE INTO v_balance
  FROM ACCOUNTS
  WHERE ACCOUNT_ID = p_from_account_id;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;

  -- Deduct from source account
  UPDATE ACCOUNTS
  SET BALANCE = BALANCE - p_amount
  WHERE ACCOUNT_ID = p_from_account_id;

  -- Add to destination account
  UPDATE ACCOUNTS
  SET BALANCE = BALANCE + p_amount
  WHERE ACCOUNT_ID = p_to_account_id;

  COMMIT;
END;
/
