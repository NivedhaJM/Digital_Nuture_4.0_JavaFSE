### Exercise 2: Implementing the Factory Method Pattern
---
## 🧠 Objective
- To implement a Factory Method Pattern that dynamically creates different types of documents like Word, PDF, and Excel, depending on the user's need.

### 1. 🏗️ What is Factory Method Pattern?

The Factory Method Pattern:

- Defines an interface for creating an object.

- Lets subclasses decide which class to instantiate.

> This pattern promotes loose coupling and scalability in object creation.

	
### 2. 🛠️ Setup

_Abstract Product Interface_

```
public interface Document {
    void open();
}

```


### 3. 🔍 Implementation

_WordDocument.java_

```
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}
```

_PdfDocument.java_

```
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

```

_ExcelDocument.java_

```
public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}
```

### 4. 🏭 Document Factories

_Abstract Factory_

```
public abstract class DocumentFactory {
    public abstract Document createDocument();
}

```

_WordFactory.java_

```
public class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

```

_PdfFactory.java_

```
public class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

```

_ExcelFactory.java_

```
public class ExcelFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

```

### 5. 🧪 Testing the Factory Pattern	

_Main.java_

```
public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}

```

### 6. 📊 Benefits of Factory Pattern	


- Promotes loose coupling and separation of concerns.

- Easily scalable: add new document types without modifying existing code.

- Follows Open/Closed Principle in SOLID.
