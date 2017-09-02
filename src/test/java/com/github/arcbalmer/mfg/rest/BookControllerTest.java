package com.github.arcbalmer.mfg.rest;

import com.github.arcbalmer.mfg.Book;
import com.github.arcbalmer.mfg.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerTest {

    @MockBean
    private BookService bookService;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldFindAllBooks() {
        Book b1 = new Book("Hunter1", new Date(150426218), "part#1");
        Book b2 = new Book("Hunter2", new Date(150426217), "part#2");
        given(bookService.getBooks()).willReturn(Arrays.asList(b1, b2));
        String body = restTemplate.getForObject("/books", String.class);
        assertThat(body).isEqualTo("[{\"name\":\"Hunter1\",\"publishingDate\":150426218,\"description\":\"part#1\"},{\"name\":\"Hunter2\",\"publishingDate\":150426217,\"description\":\"part#2\"}]");
    }

}
