package com.github.arcbalmer.mfg.service;

import com.github.arcbalmer.mfg.Book;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BookService {

    public List<Book> getBooks() {
        Book b1 = new Book("Hunter1", new Date(), "part#1");
        Book b2 = new Book("Hunter2", new Date(), "part#2");
        return Arrays.asList(b1, b2);
    }

}
