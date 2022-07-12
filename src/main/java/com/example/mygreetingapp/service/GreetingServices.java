package com.example.mygreetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServices {
    public String message(){
        return "World";
    }
}
