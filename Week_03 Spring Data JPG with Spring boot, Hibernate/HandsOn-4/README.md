# Java Persistence API (JPA)

JPA is a Java specification (JSR 338) that defines a standard for object-relational mapping (ORM) and data persistence in Java applications.

> JSR 338 Specification for persisting, reading and managing data from Java objects

> Does not contain concrete implementation of the specification

> Hibernate is one of the implementation of JPA

# Hibernate

A popular ORM tool that provides a concrete implementation of the JPA specification.

> ORM Tool that implements JPA

# Spring Data JPA

A Spring framework module that builds on JPA by abstracting away boilerplate code (like repository creation, query handling, and transactions).

> Does not have JPA implementation, but reduces boiler plate code

> This is another level of abstraction over JPA implementation provider like Hibernate

> Manages transactions

---

## 📘 `README.md` for Hibernate Project

This is a simple standalone Java application using **Hibernate ORM** to persist `Employee` data into a MySQL database.

---

## 🧩 Technologies Used
- Java 17+
- Maven
- Hibernate Core (5.6.x)
- MySQL
- JPA Annotations (jakarta.persistence)

---


## ⚙️ Setup Instructions

### 1. Create MySQL Database

```sql
CREATE DATABASE hibernatedb;
```

## 2. Update Configuration

In `hibernate.cfg.xml:`

```
<property name="connection.username">root</property>
<property name="connection.password">your_password</property>
```

## 3. Build and Run

- Right-click MainApp.java → Run As → Java Application

- Hibernate will insert an employee into the database.



---

## 📘 `README.md` for Spring Data JPA Project


This project demonstrates the use of **Spring Boot** and **Spring Data JPA** to persist `Employee` data into a MySQL database.

---

## 🧩 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL Connector
- Maven

---


## ⚙️ Setup Instructions

### 1. Create MySQL Database

```sql
CREATE DATABASE hibernatedb;
```

### 2. Configure DB in `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/hibernatedb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

### 3. Run the Project

- Right-click on SpringDataDemoApplication.java

- Select Run As → Java Application

---

# 🚀 How It Works
The main class implements CommandLineRunner

On startup, it saves a new Employee via the service and repository layers

All boilerplate (Session, Transactions) is managed by Spring

---
---


```
| Feature                | JPA                | Hibernate                         | Spring Data JPA                            |
|------------------------|--------------------|-----------------------------------|--------------------------------------------|
| Type                   | Specification      | ORM Implementation (JPA provider) | Framework/Abstraction                      |
| Implementation         | No                 | Yes                               | No                                         |
| Manages ORM Logic      | No                 | Yes                               | Delegates to JPA provider (like Hibernate) |
| Boilerplate Code       | Moderate           | High                              | Very Low                                   |
| Transaction Management | Manual             | Manual                            | Automatic (via Spring annotations)         |
| Example Use Case       | Entity Definitions | Custom ORM logic                  | Rapid CRUD API development                 |

```