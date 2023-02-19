package com.example.basestudy.web.controller;

import com.example.basestudy.web.dto.HelloResponseDto;
import com.example.basestudy.web.dto.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello";
    }

    @GetMapping("/dto")
    public HelloResponseDto helloDto(@RequestParam String name,
                                     @RequestParam int amount){

        return new HelloResponseDto(name, amount);
    }
}
