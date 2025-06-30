package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public void printBooks() {
        System.out.println("Books fetched from BookRepository.");
    }
    public BookRepository() {
        System.out.println("BookRepository bean initialized.");
    }

    public List<String> getAllBooks() {
        System.out.println("BookRepository: Fetching all books from 'database'...");
        // Simulate fetching data from a database
        return Arrays.asList("The Great Gatsby", "1984", "To Kill a Mockingbird", "Pride and Prejudice");
    }
}
