package org.ezrawilliams.model;

/*
POJO class - model class - transfer object class (the replica of the table in the database)
POJO - Plain Old Java Objects - attributes, constructor, getters, setters
So in DAO this is the model/ DTO - Data Transfer Object - the object we are saving
 */

public class Books {
    private int isbn;
    private String bookName;
    public Books() {   }
    public Books(int isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }
    // getter setter methods
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
