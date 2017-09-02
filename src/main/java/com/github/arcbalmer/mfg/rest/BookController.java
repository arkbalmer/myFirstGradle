package com.github.arcbalmer.mfg.rest;

import com.github.arcbalmer.mfg.Book;
import com.github.arcbalmer.mfg.service.BookService;

import java.util.List;

public class BookController {

    private BookService bookService;

    public BookController() {
        bookService = new BookService();
    }

    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

}
