package com.example.demo.com.wxb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class myclass {
    @RequestMapping("/cook/{name}")
    public String bookName(@PathVariable String name){
        return "reading Spring boot!";
    }
}
