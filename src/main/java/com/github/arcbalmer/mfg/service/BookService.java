package com.github.arcbalmer.mfg.service;

import com.github.arcbalmer.mfg.dao.entity.Book;
import com.github.arcbalmer.mfg.dao.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

}
