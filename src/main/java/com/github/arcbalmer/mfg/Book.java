package com.github.arcbalmer.mfg;

import java.util.Date;

public class Book {

    private String name;
    private Date publishingDate;
    private String description;

    public Book() {
    }

    public Book(String name, Date publishingDate, String description) {
        this.name = name;
        this.publishingDate = publishingDate;
        this.description = description;
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
