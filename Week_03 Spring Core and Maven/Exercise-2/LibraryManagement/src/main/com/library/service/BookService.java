package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayAllBooks() {
        List<String> books = bookRepository.getAllBooks();
        System.out.println("BookService: List of available books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
