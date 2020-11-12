package com.xxx.xxx.demo123.service.impl;

import com.xxx.xxx.demo123.service.AddService;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements AddService {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
