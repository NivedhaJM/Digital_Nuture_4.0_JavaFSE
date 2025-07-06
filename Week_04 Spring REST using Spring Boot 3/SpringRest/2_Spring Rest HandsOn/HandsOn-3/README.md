# REST - Get country based on country code 

To write a REST service that returns a specific country based on country code. The country code is case insensitive.

## Overview

**Method**: GET

**URL**: /country

**Controller** : com.cognizant.spring-learn.controller.CountryController

**Method Annotation**: @GetMapping("/countries/{code}")

**Method Name**: getCountry(String code)

**Method Implementation**: Invoke countryService.getCountry(code) 

**Sample Method**: com.cognizant.spring-learn.service.CountryService.getCountry(String code)

**Sample Request**: http://localhost:8083/country/in

**Sample Response**: 
```
{
  "code": "IN",
  "name": "India"
}
```

---

## ✅ Features

- REST endpoint: `/countries/{code}`
- Case-insensitive country code matching
- Country list configured in an external XML file
- Uses `@PathVariable` and Java 8 `Stream` API
- Response is automatically returned in JSON format

---

## 🛠️ Technologies Used

- Java 8+
- Spring Boot
- Spring Web
- Jackson for JSON conversion
- SLF4J for logging
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

- Reload `http://localhost:8083/countries/us`

- Click on the request `(/hello)` → Go to Headers tab:

> - View Request Headers (User-Agent, Accept, etc.).

> - View Response Headers (Content-Type, Content-Length, etc.).

---

## 🔗 API Endpoint

**Request**

Method: `GET`

URL: `http://localhost:8083/countries/us`

**Response**

```
{
  "code": "IN",
  "name": "India"
}
```
---

## 🔎 How It Works

1. Controller receives a GET request at `/countries/{code}`

2. `@PathVariable` extracts the code from URL

3. Controller calls `CountryService.getCountry(code)`

4. Service loads country list from `country.xml`

5. Filters the list using case-insensitive matching

6. Returns the matched `Country` object as JSON

---

# Important SME

```
| Concept              | Explanation                               |
| -------------------- | ----------------------------------------- |
| `@PathVariable`      | Extracts `code` from the URL              |
| `equalsIgnoreCase()` | Ensures case-insensitive comparison       |
| `@Service`           | Annotates the `CountryService` class      |
| `RestController`     | Automatically serializes response to JSON |
| Jackson              | Converts Java object to JSON              |
| Spring XML           | Configures beans without Java code        |

```

# 👤 Author

Created by [me](https://github.com/NivedhaJM) for hands-on learning.


