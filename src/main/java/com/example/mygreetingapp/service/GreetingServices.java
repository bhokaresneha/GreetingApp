package com.example.mygreetingapp.service;

import com.example.mygreetingapp.module.User;
import com.example.mygreetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
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
    public List<User> getallData(){
        return greetingRepository.findAll();
    }

    public User editData(User data,Long id){
        User data1=new User(data,id);
        greetingRepository.save(data1);
        return data1;
    }

    public String delete(Long id) {
        Optional<User> newuser =greetingRepository.findById(id);
        if (newuser.isPresent()){
            greetingRepository.delete(newuser.get());
            return "Record is deleted with id " +id;
        }
        return "Record not Found";
    }
}
