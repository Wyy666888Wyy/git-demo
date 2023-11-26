package com.itheima.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@ResponseBody
//@Controller
@RestController
@RequestMapping("/hello")
public class HelloWorld {


    @GetMapping("/helloWorld")
    public  String helloWorld(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hotfix");
        System.out.println("master-test");
        System.out.println("hotfix-test");
         System.out.println("hotfix-test1111");
        return "hello1";
    }
}
