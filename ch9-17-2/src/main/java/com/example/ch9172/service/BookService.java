package com.example.ch9172.service;

import com.example.ch9172.domain.Book;

import java.util.List;

public interface BookService {
    /*新增一本图书*/
    int addBook(Book book);

    /*修改一本图书*/
    int update(Book book);

    /*根据id删除一本图书*/
    int deleteById(Integer id);

    /*查询全部*/
    List<Book> queryAll();

    /*查询单条*/
    Book queryById(Integer id);
}
