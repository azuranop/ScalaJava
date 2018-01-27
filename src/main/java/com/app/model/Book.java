package com.app.model;

public class Book {
    private String name = null;
    private String author = null;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book {" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

}
