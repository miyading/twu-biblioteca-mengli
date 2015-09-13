package com.twu.biblioteca;

import java.util.Date;

/**
 * Created by mlding on 9/13/15.
 */
public class Book {
    private String bookId;
    private String name;
    private String authorName;
    private Date publishDate;

    public Book(String bookId, String name, String authorName, Date publishDate) {
        this.bookId = bookId;
        this.name = name;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public Book(String bookNum) {
        this.bookId = bookNum;
    }

    public String getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }
}
