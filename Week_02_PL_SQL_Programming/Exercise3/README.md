# Exercise 3: Stored Procedures

#### 🏦 PL/SQL Stored Procedures for Banking Operations
> This repository contains PL/SQL stored procedures designed to support critical banking operations, including monthly interest processing, employee bonus calculation, and customer fund transfers. These procedures help automate regular tasks and enforce business rules within the Oracle database environment.

---

## ✅ Scenario 1: Process Monthly Interest for Savings Accounts

**Business Requirement:**  Apply a 1% interest rate to the balance of all **savings accounts** every month.

**Script:** `process_monthly_interest.sql`

**Procedure Logic:**  
- Locate all accounts with `ACCOUNT_TYPE = 'SAVINGS'`.
- Increase their `BALANCE` by 1% (i.e., `BALANCE + BALANCE * 0.01`).

**Assumed Table:**

```
CREATE TABLE ACCOUNTS (
  ACCOUNT_ID    NUMBER PRIMARY KEY,
  CUSTOMER_ID   NUMBER,
  ACCOUNT_TYPE  VARCHAR2(20),
  BALANCE       NUMBER(12,2)
);
```

---


## ✅ Scenario 2: Update Employee Bonus Based on Performance

**Business Requirement:**
Provide a bonus to all employees in a specific department, increasing their salary by a given percentage.

**Script:** `update_employee_bonus.sql`

**Procedure Logic:**  
- Takes two parameters: `p_department_id` and `p_bonus_percent`.
- Updates the `SALARY` of all employees in the given `department`.

**Assumed Table:**

```
CREATE TABLE EMPLOYEES (
  EMPLOYEE_ID     NUMBER PRIMARY KEY,
  NAME            VARCHAR2(100),
  DEPARTMENT_ID   NUMBER,
  SALARY          NUMBER(10,2)
);
```

---

## ✅ Scenario 3: Transfer Funds Between Customer Accounts
**Business Requirement:**
Allow customers to transfer money between their accounts only if the source account has sufficient funds.

**Script:** `transfer_funds.sql`

**Procedure Logic:**

- Takes three parameters: p_from_account_id, p_to_account_id, and p_amount.
- Checks if the from account has enough balance.
- If sufficient, deducts the amount from the source and adds it to the destination account.
- Throws an error if funds are insufficient.

**Assumed Table:**

```
CREATE TABLE ACCOUNTS (
  ACCOUNT_ID    NUMBER PRIMARY KEY,
  CUSTOMER_ID   NUMBER,
  ACCOUNT_TYPE  VARCHAR2(20),
  BALANCE       NUMBER(12,2)
);
```

--- 

## 🧪 How to Run

 1. Connect to your Oracle SQL environment (e.g., SQL Developer).
 2. Create the required tables using the CREATE TABLE statements above.
 3. Insert sample data as needed for testing.
 4. Compile each procedure using the provided PL/SQL code.
 5. Execute the procedures using EXEC or anonymous blocks with parameters.