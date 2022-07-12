package com.example.mygreetingapp.controller;

import com.example.mygreetingapp.module.User;
import com.example.mygreetingapp.service.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class GreetingAppController {

    //Using Service Layer
    @Autowired
    GreetingServices service1;
    @GetMapping("/serviceData")
    public String serviceData(){
        return "Hello "+service1.message();
    }
    //Using RequestBody
    @GetMapping("/getData")
    public String getdata(@RequestBody User data){
        return "Hello "+data.getFirstName()+" "+data.getLastName();
    }

    //Using RequestMapping
    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public String reqData(){
        return "Hello RequestMap World";
    }

    //Using RequestMapping And RequestParam
    @RequestMapping(value = {"/get1"},method = RequestMethod.GET)
    public String reqData1(@RequestParam String name, @RequestBody User data){
        return "Hello "+name+" "+data.getLastName();
    }

    //Using PathVariable
    @GetMapping("/param/{name}")
    public String pathData(@PathVariable String name){
        return "Hello "+name+" !!!!" ;
    }
    //UC-3
    @GetMapping("/hello")
    public String sayPosting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        if (lastName == null) lastName = "";
        else if (firstName == null) firstName = "";
        else if (firstName == null && lastName == null) {
            firstName = "";
            lastName = "";
        }
        return service1.sayHelloByName(firstName, lastName);
    }

    //UC-4
    @PostMapping("/post")
    public User sayHello (@RequestBody User user){
        User newuser = service1.sayHello(user);
        return newuser;
    }

}
