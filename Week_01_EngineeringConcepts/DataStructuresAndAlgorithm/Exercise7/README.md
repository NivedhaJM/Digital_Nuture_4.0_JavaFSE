### Exercise 7: Financial Forecasting
---
## 🧠 Objective
- Build a tool to predict future financial values using recursive algorithms based on the historical growth rates.

### 1. 🔁 Understanding Recursive Algorithms
__Recursion__

- Recursion is a technique where a function calls itself to solve smaller instances of a problem.
- It’s especially helpful for problems with repetitive or layered calculations like financial growth predictions.

__🔁 Example Pattern__

Future Value (FV) at year n can be calculated as:

FV(n) = FV(n-1) * (1 + growthRate)
	
### 2. 🛠️ Setup

We define a recursive method that:

> Takes the initial value, growth rate, and target year

> Calculates value recursively for each year

### 3. 🔍 Implementation
_Recursive Function_

``` 
public static double predictFutureValue(double currentValue, double rate, int years) {
    if (years == 0) return currentValue;
    return predictFutureValue(currentValue * (1 + rate), rate, years - 1);
}

```

### 4. 📊 Analysis

Time Complexity

> Recursive approach: O(n) 

For each recursive call, one multiplication occurs. 

Use memoization or switch to iterative approach for large n to avoid stack overflow.
