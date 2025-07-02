# LibraryManagement - Spring Application Exercises

This project demonstrates how to configure and build a basic Spring Framework application for managing a library. The exercises cover Spring configuration, dependency injection, AOP logging, and Maven setup.

---

## 🧩 Exercise 1: Configuring a Basic Spring Application

### 📌 Scenario
Your company is developing a web application for managing a library. You will use Spring Framework to manage backend operations.

### ✅ Steps

1. **Set Up a Spring Project**
   - Create a Maven project named `LibraryManagement`.
   - Add Spring Core dependency in `pom.xml`.

2. **Configure the Application Context**
   - Create `applicationContext.xml` in `src/main/resources`.
   - Define Spring beans for `BookService` and `BookRepository`.

3. **Define Service and Repository Classes**
   - Create `com.library.service.BookService`
   - Create `com.library.repository.BookRepository`

4. **Run the Application**
   - Create a main class (e.g., `Main`) to load the Spring context and verify bean configuration.

---

## 🧩 Exercise 2: Implementing Dependency Injection

### 📌 Scenario
Use Spring IoC and Dependency Injection to wire `BookService` with `BookRepository`.

### ✅ Steps

1. **Modify XML Configuration**
   - Update `applicationContext.xml` to inject `BookRepository` into `BookService`.

2. **Update the BookService Class**
   - Add a setter method in `BookService` for `BookRepository`.

3. **Test the Configuration**
   - Run `Main` and confirm that DI is working correctly.

---

## 🧩 Exercise 3: Implementing Logging with Spring AOP

### 📌 Scenario
Add logging functionality using Spring AOP to measure method execution time.

### ✅ Steps

1. **Add Spring AOP Dependency**
   - Include Spring AOP in `pom.xml`.

2. **Create Logging Aspect**
   - Add `LoggingAspect` in `com.library.aspect`.
   - Use `@Around` advice to log execution time.

3. **Enable AspectJ Support**
   - In `applicationContext.xml`, enable AspectJ and declare the aspect bean.

4. **Test Logging**
   - Run the main class and check console logs for method execution timing.

---

## 🧩 Exercise 4: Creating and Configuring a Maven Project

### 📌 Scenario
You need a Maven setup to manage dependencies and build configuration.

### ✅ Steps

1. **Create Maven Project**
   - Name the project `LibraryManagement`.

2. **Add Spring Dependencies**
   - Include:
     - `spring-context`
     - `spring-aop`
     - `spring-webmvc`

3. **Configure Maven Plugins**

---

## 📁 Directory Structure

LibraryManagement

	src/main/java
		com/library/
			service/BookService.java
			repository/BookRepository.java
			Main.java
	src/main/resources/
		applicationContext.xml
	pom.xml
