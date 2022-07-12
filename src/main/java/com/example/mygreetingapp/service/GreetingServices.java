package com.example.mygreetingapp.service;

import com.example.mygreetingapp.module.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingServices {
    public String message(){
        return "World";
    }
    public String sayHelloByName(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName + "!!!";
    }
}
