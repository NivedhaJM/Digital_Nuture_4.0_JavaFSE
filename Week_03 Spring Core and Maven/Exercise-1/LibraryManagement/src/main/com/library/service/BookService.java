package com.library.service;

import java.util.List;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        bookRepository.printBooks();
    }
    
    public void displayAllBooks() {
        List<String> books = bookRepository.getAllBooks();
        System.out.println("BookService: List of available books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
