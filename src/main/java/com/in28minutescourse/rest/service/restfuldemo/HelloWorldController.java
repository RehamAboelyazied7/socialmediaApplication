package com.in28minutescourse.rest.service.restfuldemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController{

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

}