package com.xxx.xxx.demo123;

import com.xxx.xxx.demo123.service.AddService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo123ApplicationTests {

    @Autowired
    AddService addService;

    @Test
    public void addTest(){
        int add = addService.add(4, 6);
        assert add == 10;
        System.out.println("addTest666");
    }

}
