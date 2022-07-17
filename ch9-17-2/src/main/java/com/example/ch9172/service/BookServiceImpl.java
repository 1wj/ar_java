package com.example.ch9172.service;

import com.example.ch9172.dao.BookDao;
import com.example.ch9172.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired(required = false)
    private BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int update(Book book) {
      return bookDao.update(book);
    }

    @Override
    public int deleteById(Integer id) {
       return bookDao.deleteById(id);
    }

    @Override
    public List<Book> queryAll() {
        return bookDao.queryAll();
    }

    @Override
    public Book queryById(Integer id) {
        return bookDao.queryById(id);
    }
}
