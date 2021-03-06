package com.github.arcbalmer.mfg.rest;

import com.github.arcbalmer.mfg.dao.entity.BookEntity;
import com.github.arcbalmer.mfg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<BookEntity> getAllBooks() {
        return bookService.getBooks();
    }

}
