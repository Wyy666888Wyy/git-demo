package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@ResponseBody
//@Controller
@RestController
@RequestMapping("/hello")
public class HelloWorld {


    @GetMapping("/helloWorld")
    public  String helloWorld(){
        System.out.println("hello");
        return "hello1";
    }
}
