package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> getAllBooks() {
        System.out.println("BookRepository: Fetching all books from 'database'...");
        return Arrays.asList("The Great Gatsby", "1984", "To Kill a Mockingbird", "Pride and Prejudice");
    }
}
