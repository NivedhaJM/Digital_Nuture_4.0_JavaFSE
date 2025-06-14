### Exercise 2: E-commerce Platform Search Function
---
## 🧠 Objective
- To implement and compare linear search and binary search on an e-commerce platform to understand their performance using asymptotic analysis (Big O notation).


### 1. 📘 Understanding Asymptotic Notation
__Big O Notation__

- Big O measures the time complexity of an algorithm as input size grows. It focuses on worst-case performance, helping us choose scalable solutions.
	
### 2. 🛠️ Setup
_Product class_

```public class Product {
    int productId;
    String productName;
    String category;
    public Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}
```

### 3. 🔍 Implementation
_Linear Search (Unsorted Array)_

``` 
public static int linearSearch(Product[] products, String targetName) {
    for (int i = 0; i < products.length; i++) {
        if (products[i].productName.equalsIgnoreCase(targetName)) {
            return i;
        }
    }
    return -1;
}
```

_Binary Search (Sorted by Product Name)_

``` 
public static int binarySearch(Product[] products, String targetName) {
    Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    int low = 0, high = products.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        int cmp = products[mid].productName.compareToIgnoreCase(targetName);
        if (cmp == 0) return mid;
        else if (cmp < 0) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
```

### 4. 📊 Analysis

> Linear Search - O(n)

Use this for small datasets or unsorted data
 
> Binary Search - O(log n)

Use this for large datasets with sorted input 