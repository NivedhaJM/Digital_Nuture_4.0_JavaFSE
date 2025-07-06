# REST - Country Web Service 

To write a REST service that returns India country details in the spring learn application.


## Overview

**Method**: GET

**URL**: /country

**Controller** : com.cognizant.spring-learn.controller.CountryController

**Method Annotation**: @RequestMapping

**Method Name**: getCountryIndia()

**Method Implementation**: Load India bean from spring xml configuration and return

**Sample Request**: http://localhost:8083/country

**Sample Response**: 
```
{
  "code": "IN",
  "name": "India"
}
```

---




## ✅ Features

- Exposes a REST endpoint at `/country`
- Reads country data from Spring XML config
- Returns JSON response with country code and name
- Includes request logging using SLF4J

---

## 🛠️ Technologies Used

- Java 8+
- Spring Boot
- Spring Web
- SLF4J for logging
- Jackson for JSON conversion
- Maven

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

URL: `http://localhost:8083/country`

**Response**

```
{
  "code": "IN",
  "name": "India"
}
```

---

## 🔎 How It Works

###📌 1. Controller Logic

URL /country maps to method `getCountryIndia()`

This method:

- Loads the XML file country.xml

- Fetches the in bean (India)

- Returns the Java object

### 📌 2. JSON Conversion

Spring Boot uses `Jackson` under the hood

The `Country` object is automatically serialized into JSON because of:
`@RestController`

Jackson dependency (included in Spring Boot)


---

# Important SME

### 1. What happens in the controller method?

When a GET request is made to /country, Spring Boot invokes getCountryIndia().

The method:

- Loads Spring XML `(country.xml)` configuration.

- Fetches the bean with `ID` in.

- Returns the `Country` object.

### 2. What happens in the controller method?

Spring Boot uses `Jackson` (included in spring-boot-starter-web) to automatically convert Java objects to JSON.

The `@RestController` annotation ensures the return value is directly written to the HTTP response body in JSON format.

### 3. In network tab of developer tools show the HTTP header details received.

- Open `http://localhost:8083/country`

- Press `F12` → Network

- Click on the `/country` entry

> - Request Headers: Host, Accept, User-Agent

> - Response Headers: Content-Type: application/json, Content-Length

For more details, check output [here](https://github.com/NivedhaJM/Digital_Nuture_4.0_JavaFSE/tree/master/Week_04%20Spring%20REST%20using%20Spring%20Boot%203/SpringRest/2_Spring%20Rest%20HandsOn/HandsOn-2)

# 👤 Author

Created by [me](https://github.com/NivedhaJM) for hands-on learning.


