package com.example.ch9172.domain;

public class Book {
    private Integer Id;
    private String name;
    private String author;

    public Book() {
    }

    public Book(Integer id, String name, String author) {
        Id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String  toString() {
        return "Book{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
