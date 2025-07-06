# Hello World RESTful Web Service 

To write a REST service in the spring learn application, that returns the text "Hello World!!" using Spring Web Framework. 

## Overview

**Method**: GET

**URL**: /hello

**Controller** : com.cognizant.spring-learn.controller.HelloController

**Method Signature**: public String sayHello()

**Method Implementation**: return hard coded string "Hello World!!"

**Sample Request**: http://localhost:8083/hello

**Sample Response**: Hello World!! 

---

## ✅ Features

- REST API using Spring Boot
- Simple GET endpoint
- Logs method start and end using SLF4J

---

## 🛠️ Technologies Used

- Java 8+
- Spring Boot
- Maven
- SLF4J (Logging)

---

## 🚀 How to Run

### ▶ Using IDE (Eclipse/IntelliJ)

1. Open the project in your IDE.

2. Run `SpringLearnApplication.java` as a Java Application.

### ▶ Using Command Line

```
# Navigate to the project folder
mvn spring-boot:run
```

---
## 📊 HTTP Header Details

### ✅ In Chrome (Browser):

- Press `F12` (Developer Tools).

- Go to Network tab.

- Reload `http://localhost:8083/hello`

- Click on the request `(/hello)` → Go to Headers tab:

> - View Request Headers (User-Agent, Accept, etc.).

> - View Response Headers (Content-Type, Content-Length, etc.).

---

## 🔗 API Endpoint

**Request**

Method: `GET`

URL: `http://localhost:8083/hello`

**Response**

`Hello World!!`

---

# 👤 Author

Created by [me](https://github.com/NivedhaJM) for hands-on learning.


