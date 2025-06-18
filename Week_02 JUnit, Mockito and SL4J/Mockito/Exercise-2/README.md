#Exercise 2: Verifying Interactions

---

##✅ Verifying Method Calls Using Mockito (JUnit + Java)
- This project demonstrates how to verify that a specific method in a dependency was called during a unit test using Mockito.

- The goal is to mock the dependency, call the service method, and verify interaction.

## 📌 Scenario

You have a service class `(MyService)` that depends on an external API `(ExternalApi)`.
To ensure `MyService `is calling the expected method on the dependency:

1. Create a mock object for the external API.

2. Inject it into `MyService`.

3. Call the service method.

4. Use `verify()` to check the interaction.

## 📁 Project Structure

main - ExternalApi.java       // Interface representing external API
main - MyService.java         // Class using the API
  
test - MyServiceTest.java     // Unit test using Mockito
  
## 🔧 Technologies Used
 - Java 8+

 - JUnit 5 

- Mockito Core

- Maven (for dependency management)

## 🧪 Test Code Summary
```
ExternalApi mockApi = Mockito.mock(ExternalApi.class);

MyService service = new MyService(mockApi);
service.fetchData();

verify(mockApi).getData(); // Verifies that getData() was called once
```

## 🛠️ Setup Instructions

- Add Maven Dependencies

> Add to your pom.xml:

```
<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Mockito -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.11.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

- Run Tests

```
mvn test
```

## ✅ Output

The MyServiceTest class will:

- Mock `ExternalApi`

- Inject it into `MyService`

- Verify that `getData()` was called when `fetchData()` is executed.

## 📜 License

This project is licensed under the MIT License.