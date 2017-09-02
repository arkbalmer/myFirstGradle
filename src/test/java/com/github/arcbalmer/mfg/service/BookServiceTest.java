package com.github.arcbalmer.mfg.service;

import com.github.arcbalmer.mfg.dao.entity.Book;
import com.github.arcbalmer.mfg.dao.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;

public class BookServiceTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldFindTwoBooks() {
        Book b1 = new Book("Hunter1", new Date(150426218), "part#1");
        Book b2 = new Book("Hunter2", new Date(150426217), "part#2");
        given(bookRepository.findAll()).willReturn(Arrays.asList(b1, b2));
        List<Book> listBook = bookService.getBooks();
        assertNotNull(listBook);
        assertEquals(2, listBook.size());
        assertEquals("Hunter1", listBook.get(0).getName());
        assertEquals("Hunter2", listBook.get(1).getName());
    }

}