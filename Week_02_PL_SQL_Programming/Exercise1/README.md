# Exercise 1: Control Structures

#### 🏦 PL/SQL Scripts for Banking Operations 
> This repository contains PL/SQL scripts designed to automate essential banking tasks, including loan interest discounts, VIP status updates, and loan due reminders. Each script is tailored to a specific business requirement and can be executed in Oracle SQL Developer or any PL/SQL-compatible environment.

---

## ✅ Scenario 1: Apply Discount to Senior Citizens' Loan Interest Rates

**Business Requirement:**  Customers aged above 60 years are eligible for a 1% discount on their loan interest rates.

**PL/SQL Objective:**  Loop through all customers, check their age, and apply a 1% discount if the age is over 60.

**Script:** `discount_senior_customers.sql`

**Assumed Table:**

```
CREATE TABLE CUSTOMERS (
  CUSTOMER_ID        NUMBER PRIMARY KEY,
  NAME               VARCHAR2(100),
  AGE                NUMBER,
  LOAN_INTEREST_RATE NUMBER(5,2)
);
```

---


## ✅ Scenario 2: Promote Customers to VIP Status Based on Balance

**Business Requirement:**
Customers with an account balance over $10,000 should be marked as VIPs.

**PL/SQL Objective:**
Iterate through all customers and set the ISVIP flag to 'TRUE' if their BALANCE is greater than 10000.

**Script:** `promote_vip_customers.sql`

**Assumed Table:**

```
CREATE TABLE CUSTOMERS (
  CUSTOMER_ID NUMBER PRIMARY KEY,
  NAME        VARCHAR2(100),
  AGE         NUMBER,
  BALANCE     NUMBER(12,2),
  ISVIP       VARCHAR2(5) DEFAULT 'FALSE'
);
```

---

## ✅ Scenario 3: Send Loan Due Reminders
**Business Requirement:**
Send reminders to customers whose loan due dates fall within the next 30 days.

**PL/SQL Objective:**
Fetch all loans due in the next 30 days and print a reminder message using DBMS_OUTPUT.

**Script:** `loan_due_reminder.sql`

**Assumed Table:**

```
CREATE TABLE LOANS (
  LOAN_ID     NUMBER PRIMARY KEY,
  CUSTOMER_ID NUMBER,
  AMOUNT      NUMBER(12,2),
  DUE_DATE    DATE
);

```