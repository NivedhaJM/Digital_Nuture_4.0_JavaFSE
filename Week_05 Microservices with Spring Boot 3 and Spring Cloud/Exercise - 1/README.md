# Bank Microservices – Account & Loan (Spring Boot)

This project contains **two independent Spring Boot microservices**:
- **Account Service** – Provides account details
- **Loan Service** – Provides loan account details

Each service is built as a separate Maven project with its own port and controller.

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Boot DevTools
- Maven

---


Each of `account` and `loan` is a separate Spring Boot project.

---

## 🔹 Account Microservice

### 📌 Features
- Exposes account details via REST
- Runs on port **8080**

### 🧪 Endpoint

`GET /accounts/{number}`


### ✅ Sample Response

```
{
  "number": "12345",
  "name": "John Doe",
  "type": "SAVINGS",
  "balance": 5600.0
}
```

---

##🔹 Loan Microservice

###📌 Features

- Exposes loan details via REST

- Runs on port 8081

### 🧪 Endpoint

`GET /loans/{number}`

### ✅ Sample Response

```
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---


# 🚀 How to Run Both Services
### 📦 1. Build Each Project

```
cd account
mvn clean package
```
```
cd loan
mvn clean package
```

### ⚙ 2. Configure Ports

In `account/src/main/resources/application.properties`:

```
server.port=8080
```

In `loan/src/main/resources/application.properties`:

```
server.port=8081
```

###▶️ 3. Run Projects

- Import both into Eclipse as Maven projects

- Run `AccountApplication.java` and `LoanApplication.java` separately

- Use the Console monitor icon to switch between outputs


# 🌐 Test with Postman or Browser

### ✅ Account Service

`http://localhost:8080/accounts/12345`

### ✅ Loan Service

`http://localhost:8081/loans/H00987987972342`

---


# 📝 Notes

> These microservices are independent — no database or shared state.

> Useful for understanding Spring Boot service separation and port-based isolation.

> You can later connect them via REST or API Gateway (e.g., Spring Cloud Gateway).

---

# 📚 References

- Spring Boot

- Spring Web

- Spring Initializr

---

# 📝 License

This project is for learning/demo purposes only.

