--create a table with the following: 

CREATE TABLE EMPLOYEES (
  EMPLOYEE_ID     NUMBER PRIMARY KEY,
  NAME            VARCHAR2(100),
  DEPARTMENT_ID   NUMBER,
  SALARY          NUMBER(10,2)
);

--insert values into the table, according to the requirements.

-- a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_department_id IN NUMBER,
  p_bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE EMPLOYEES
  SET SALARY = SALARY + (SALARY * (p_bonus_percent / 100))
  WHERE DEPARTMENT_ID = p_department_id;

  COMMIT;
END;
/
