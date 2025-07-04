package com.example;

import com.example.model.Employee;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setSalary(50000);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
        session.close();

        System.out.println("Employee saved successfully");
    }
}
