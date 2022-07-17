package com.example.ch9172.controlle;

import com.example.ch9172.domain.Book;
import com.example.ch9172.service.BookService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired(required = false)
    private BookService bookService;

    /*新增一本图书*/
    @RequestMapping("addBook")
    public void addBook(){
        Book book=new Book(2003,"三生三世","王健");
        int i=bookService.addBook(book);
        System.out.println("成功插入了"+i+"本图书");

    }
    /*根据id查询一本图书*/
    @RequestMapping("selectById")
    public void selectById(){
        Book book=bookService.queryById(2003);
        System.out.println(book);

    }
    @RequestMapping("selectById2")
    public Book selectById2(){
        Book book=bookService.queryById(1003);
       return book;

    }
    /*修改一本图书*/
    @RequestMapping("update")
    public void update(){
        Book book=bookService.queryById(2003);
        book.setName("十里桃花");
        book.setAuthor("杨幂");
        int update = bookService.update(book);
        System.out.println("成功修改了"+update+"本图书");
    }

    @RequestMapping("queryAll")
    public String  queryAll(){
        List<Book> books=bookService.queryAll();
       // books.forEach(book -> System.out.println(book));
        return books.toString();
    }

    @RequestMapping("deleteById")
    public void deleteById(){

        int i=bookService.deleteById(2003);
        System.out.println("成功删除了"+i+"本图书");

    }

}
