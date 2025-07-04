package com.example;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class MainApp implements CommandLineRunner {

    @Autowired
    private EmployeeService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Employee emp = new Employee();
        emp.setName("Alice");
        emp.setSalary(60000);
        service.addEmployee(emp);
    }
}
