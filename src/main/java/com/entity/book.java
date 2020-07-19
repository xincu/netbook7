package com.entity;

public class book {
    private Integer bookId;

    private String bookName;

    private String bookKind;

    private String bookDescribed;

    private Integer bookAuthorWid;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookKind() {
        return bookKind;
    }

    public void setBookKind(String bookKind) {
        this.bookKind = bookKind == null ? null : bookKind.trim();
    }

    public String getBookDescribed() {
        return bookDescribed;
    }

    public void setBookDescribed(String bookDescribed) {
        this.bookDescribed = bookDescribed == null ? null : bookDescribed.trim();
    }

    public Integer getBookAuthorWid() {
        return bookAuthorWid;
    }

    public void setBookAuthorWid(Integer bookAuthorWid) {
        this.bookAuthorWid = bookAuthorWid;
    }
}