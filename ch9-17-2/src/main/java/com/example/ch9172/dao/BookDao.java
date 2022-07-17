package com.example.ch9172.dao;

import com.example.ch9172.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookDao {
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
