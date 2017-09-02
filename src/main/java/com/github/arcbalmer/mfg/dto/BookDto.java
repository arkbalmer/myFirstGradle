package com.github.arcbalmer.mfg.dto;

import java.util.Date;

public class BookDto {

    private Long id;

    private String name;

    private Date publishingDate;

    private String description;

    public BookDto() {
    }

    public BookDto(Long id, String name, Date publishingDate, String description) {
        this.id = id;
        this.name = name;
        this.publishingDate = publishingDate;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
