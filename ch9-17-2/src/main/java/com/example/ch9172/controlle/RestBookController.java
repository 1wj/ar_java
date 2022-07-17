package com.example.ch9172.controlle;

import com.example.ch9172.domain.Book;
import com.example.ch9172.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/book")
public class RestBookController {

    @Autowired
    BookService bookService;
    @GetMapping
    public List<Book> queryAll(){
        System.out.println("正在查询全部");
        List<Book> books=bookService.queryAll();
        return books;
    }

    @GetMapping("/{id}")
    public Book queryAll(@PathVariable Integer id){
        System.out.println("正在查询单条");
       Book books=bookService.queryById(id);
        return books;
    }

    @PostMapping
    public int addBook(Book book){
        System.out.println("正在插入");
        return bookService.addBook(book);

    }
    @PutMapping
    public int update(Book book){
        System.out.println("正在修改");
        return bookService.update(book);
    }

  /*  @DeleteMapping
    public int delete(@RequestParam("id") Integer id){
        System.out.println("正在删除");
        return bookService.deleteById(id);
    }*/
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id){
        System.out.println("正在删除");
        return bookService.deleteById(id);
    }
}
