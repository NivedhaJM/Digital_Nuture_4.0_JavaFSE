# Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown Methods in JUnit



![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![JUnit](https://img.shields.io/badge/Testing-JUnit%204-red.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)
![Status](https://img.shields.io/badge/Project-Complete-brightgreen.svg)

---

## 📘 Scenario

This project demonstrates how to organize unit tests in Java using the **Arrange-Act-Assert (AAA)** pattern along with the use of **`@Before`** and **`@After`** annotations in JUnit 4 for setting up and tearing down test fixtures.

## ✅ Learning Objectives

- Understand and implement the AAA pattern in unit tests.
- Use `@Before` to initialize objects before each test.
- Use `@After` to clean up resources after each test.
- Structure unit tests clearly for maintainability and readability.


## 🛠 Setup Instructions

1. Create a new Java project in Eclipse named `Exercise4_JUnit_AAA`.
2. Add a class `Calculator.java` in the `src/` folder.
3. Add a test class `CalculatorTest.java` in the `test/` folder.
4. Add **JUnit 4** to the project:
   - Right-click the project → **Build Path → Add Libraries → JUnit → JUnit 4 → Finish**


## 📂 Files

src - `Calculator.java`

test - `CalculatorTest.java`


## 🔍 Notes

> The AAA pattern helps separate the logic of test cases into 3 clear steps.

> Test fixtures ensure consistent setup and cleanup for each test run.

> Output in the console (Setup complete., Teardown complete.) confirms lifecycle hooks.


## 🧾 Author

This example is part of a JUnit learning exercise focusing on good unit testing practices.

