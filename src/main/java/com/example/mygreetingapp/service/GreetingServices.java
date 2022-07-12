package com.example.mygreetingapp.service;

import com.example.mygreetingapp.module.User;
import com.example.mygreetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingServices {
    public String message(){
        return "World";
    }
    public String sayHelloByName(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName + "!!!";
    }

    @Autowired
    GreetingRepository greetingRepository;
    public User sayHello(User user){
        return greetingRepository.save(user);

    }
    public Optional<User> getMsgById(Long id){
        return greetingRepository.findById(id);
    }

}
