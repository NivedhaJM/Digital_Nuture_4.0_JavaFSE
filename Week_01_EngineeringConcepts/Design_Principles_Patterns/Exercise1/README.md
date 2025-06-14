### Exercise 1: Implementing the Singleton Pattern
---
## 🧠 Objective
- Ensure that only one instance of a Logger utility class exists throughout the application's lifecycle using the Singleton Design Pattern.

### 1. 🧱 What is Singleton Pattern?

Singleton Pattern ensures that:

- Only one instance of a class is created.

- The same instance is globally accessible.
	
### 2. 🛠️ Setup

Logger Class Requirements:

	 - Private constructor
	 - Private static instance
	 - Public static getInstance() method



### 3. 🔍 Implementation
_Logger.java (Singleton)_

``` 
public class Logger {
    // Private static instance
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
```

### 4. 🧪 Testing the Singleton

_Main.java_

```
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting the application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Application is running.");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton verified.");
        } else {
            System.out.println("Different instances exist. Singleton failed.");
        }
    }
}
```

### 5. 📊 Benefits of Singleton

- Saves memory
	
- Useful for logging, caching, configuration, etc.
	
- Ensures controlled access to shared resources