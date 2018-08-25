package com.example.demo.com.wxb.controller;

import com.example.demo.com.wxb.domain.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class myclass {
    @RequestMapping(value = "/cook/{name}",produces = "application/json;charset=UTF-8")
    public Book bookName(@PathVariable String name){
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("微服务架构");
        return book;
    }
}
