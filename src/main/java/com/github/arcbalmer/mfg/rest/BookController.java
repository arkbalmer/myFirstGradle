package com.github.arcbalmer.mfg.rest;

import com.github.arcbalmer.mfg.dao.entity.BookEntity;
import com.github.arcbalmer.mfg.dto.BookDto;
import com.github.arcbalmer.mfg.service.BookService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @RequestMapping(value = "/books", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<BookDto> getAllBooks() {
        return bookService.getBooks().stream().map(this::toDto).collect(Collectors.toList());
    }

    private BookDto toDto(BookEntity bookEntity) {
        return dozerBeanMapper.map(bookEntity, BookDto.class);
    }

}
