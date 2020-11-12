package com.xxx.xxx.demo123.controller;


import com.xxx.xxx.demo123.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private AddService addService;

    @GetMapping("/add")
    public int add(int a, int b){
        return addService.add(a,b);
    }
}
