# JWT Authentication Service (Spring Boot)

This project implements a simple JWT authentication service using Spring Boot, Basic Auth, and JJWT. It returns a JWT token when valid credentials are sent.

---

## ✅ Features

- Basic Authentication using `user:pwd`
- JWT token generation
- Spring Boot 3 compatible
- Minimal configuration

---

## 🛠 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Security
- JJWT (`io.jsonwebtoken`)
- Maven

---

## 🚀 How to Run

### 1. Clone or Download

```
git clone https://github.com/NivedhaJM/Digital_Nuture_4.0_JavaFSE.git

cd "Week_04 Spring REST using Spring Boot 3\JWT"

```

### 2. Build with Maven

```
mvn clean install
```

### 3. Run the Application

```
mvn spring-boot:run
```

Or from Eclipse: 

`Right-click → Run As → Java Application`

### 📦 Using curl:

```
curl -u user:pwd http://localhost:8090/authenticate
```

### 🌐 Using Browser:
Go to:

```
http://localhost:8090/authenticate
```

Enter:

`Username: user`

`Password: pwd`

You will receive a JSON response:

[RESPONSE](url)


## ⚙ Configuration

### 1. application.properties

`server.port=8090`

## In-Memory User

Defined in SecurityConfig.java:

`User.withUsername("user").password("pwd").roles("USER");`

# 📝 License

This is a basic project for learning/demo purposes.