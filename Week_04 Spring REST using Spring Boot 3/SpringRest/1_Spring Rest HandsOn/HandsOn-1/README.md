# Spring Learn Application

This is a basic Spring Boot web application built for learning and development purposes. It includes Spring Boot DevTools and Spring Web dependencies and is structured using Maven.


---

## 🧠 Technologies Used

- Java 17+ (or your installed version)
- Spring Boot
  - Spring Web
  - Spring Boot DevTools
- Maven
- Eclipse IDE (or any Java IDE)

---

## 🚀 How to Set Up and Run

### 🔧 1. Generate Project

Go to [https://start.spring.io](https://start.spring.io) and configure:
- **Group**: `com.cognizant`
- **Artifact**: `spring-learn`
- Dependencies:
  - ✅ Spring Web
  - ✅ Spring Boot DevTools

Download the `.zip` file.

---

### 📦 2. Extract and Build Using Maven (Command Line)

Extract the `.zip` to your desired workspace folder.  
Then open **Command Prompt** and navigate into the project directory.

Run the Maven build command with proxy settings:

```bash
mvn clean package \
-Dhttp.proxyHost=proxy.cognizant.com \
-Dhttp.proxyPort=6050 \
-Dhttps.proxyHost=proxy.cognizant.com \
-Dhttps.proxyPort=6050 \
-Dhttp.proxyUser=123456
```
Replace 123456 with your actual proxy user ID.

---

### 💻 3. Import into Eclipse
Open Eclipse.

Go to:
`File > Import > Maven > Existing Maven Projects`

Browse to the extracted folder.

Click Finish.

---

### ▶️ 4. Run the Application
1. Open SpringLearnApplication.java.

2. Add a print statement (optional):

`System.out.println("SpringLearnApplication started successfully!");`

3. Right-click the file → Run As > Java Application.

---

### 🧪 5. Testing & Verification

You can verify the application runs by:

> Checking the Eclipse console logs

---

```
| File                          | Purpose                           |
| ----------------------------- | --------------------------------- |
| `SpringLearnApplication.java` | Main Spring Boot launcher class   |
| `application.properties`      | Configuration settings            |
| `pom.xml`                     | Maven build and dependency config |
```

---

`mvn clean` # Clean target directory

`mvn compile`  # Compile source code

`mvn test` # Run tests

`mvn spring-boot:run` # Run Spring Boot app

---

### 📌 Notes

- Ensure internet access or proxy is set correctly for `Maven` builds.

- The application uses embedded `Tomcat` on `port 8080` by default.

- `spring-boot-devtools` provides hot-reload support for rapid development.

---

# 👤 Author
Created by [me](https://github.com/NivedhaJM) for hands-on learning.


