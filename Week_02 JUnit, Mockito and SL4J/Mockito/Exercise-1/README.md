#Exercise 1 : Mocking and Stubbing

---

##✅ Mocking External API Using Mockito (JUnit + Java)
- This project demonstrates how to unit test a service that depends on an external API using Mockito.
- The goal is to mock the external API, stub its methods, and test your service class in isolation.

## 📌 Scenario

You have a service class (MyService) that depends on an external API (ExternalApi).
To test MyService without calling the real external system, you:

1. Create a mock object for the external API.

2. Stub its methods to return predefined values.

3. Inject the mock into MyService.

4. Assert the result.

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
when(mockApi.getData()).thenReturn("Mock Data");

MyService service = new MyService(mockApi);
String result = service.fetchData();

assertEquals("Mock Data", result);
verify(mockApi, times(1)).getData();
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

- Mock ExternalApi

- Stub getData() to return "Mock Data"

- Validate that MyService.fetchData() correctly returns that value.

## 📜 License

This project is licensed under the MIT License.