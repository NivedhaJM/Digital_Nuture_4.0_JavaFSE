# SpringLearn - Hands-on 4

## 🧾 Description

This Spring Boot application demonstrates how to load a simple Java bean (`Country`) using an XML configuration file (`country.xml`). The application initializes the Spring context, reads the `Country` bean, and logs its details.

This simulates functionality for an airline booking system where country details like ISO codes are needed for dropdown menus.

---

## ⚙️ Technologies Used

- Java 17+
- Spring Boot
- Spring Core (XML configuration)
- SLF4J (Logging)
- Maven

---

## ✍️ Hands-on Objectives

- Create and configure a Spring XML file with a `<bean>` definition.
- Load the bean using `ApplicationContext`.
- Log the flow of execution via constructor, getters, and setters.

---

## 🚀 Steps to Run

### 1. Build the Project (If Needed)

Use Maven to build with proxy (optional):

```
mvn clean install \
-Dhttp.proxyHost=proxy.cognizant.com \
-Dhttp.proxyPort=6050 \
-Dhttps.proxyHost=proxy.cognizant.com \
-Dhttps.proxyPort=6050 \
-Dhttp.proxyUser=your_id
```
Replace `your_id` with your actual proxy username.


---

### 2. Configure Logging 

Ensure `application.properties` contains:

```
spring.application.name=spring-learn
logging.level.root=DEBUG
logging.level.com.cognizant.springlearn=DEBUG
```

---



### ▶️ 3. Run the Application

Run SpringLearnApplication.java:

1. Open `SpringLearnApplication.java`.

2. Right-click the file → Run As > Java Application.

---

`mvn clean` # Clean target directory

`mvn compile`  # Compile source code

`mvn test` # Run tests

`mvn spring-boot:run` # Run Spring Boot app

---

# 🧠 SME Explanation of Spring Concepts

### ✅ `country.xml`

```
<bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN"/>
    <property name="name" value="India"/>
</bean>
```

`<bean>`: Defines a Spring-managed object.

`id`: Unique identifier to refer to the bean.

`class`: Fully qualified Java class name.

`<property>`: Injects values via setters.

### ✅ `Country.java`

Fields: `code`, `name`

Getters/Setters with logging

Constructor with log: `"Inside Country Constructor."`

Overridden `toString()` method

###🔸 `ApplicationContext`

Spring's core container interface used for:

- Loading bean definitions

- Managing lifecycle

- Dependency injection

###🔸 `ClassPathXmlApplicationContext`

An implementation of ApplicationContext that:

- Loads the XML configuration from the classpath (e.g., src/main/resources)

- Instantiates and wires beans

---

# 👤 Author
Created by [me](https://github.com/NivedhaJM) for hands-on learning.


