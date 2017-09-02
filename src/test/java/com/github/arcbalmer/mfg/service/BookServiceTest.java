package com.github.arcbalmer.mfg.service;

import com.github.arcbalmer.mfg.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookServiceTest {

    private BookService bookService;

    @Before
    public void setUp() {
        bookService = new BookService();
    }

    @Test
    public void shouldFindTwoBooks() {
        List<Book> listBook = bookService.getBooks();
        assertNotNull(listBook);
        assertEquals(2, listBook.size());
        assertEquals("Hunter1", listBook.get(0).getName());
        assertEquals("Hunter2", listBook.get(1).getName());
    }

}