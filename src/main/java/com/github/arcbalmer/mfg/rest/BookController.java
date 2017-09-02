package com.github.arcbalmer.mfg.rest;

import com.github.arcbalmer.mfg.Book;
import com.github.arcbalmer.mfg.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController() {
        bookService = new BookService();
    }

    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

}
