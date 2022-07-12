package com.example.mygreetingapp.controller;

import com.example.mygreetingapp.module.User;
import org.springframework.web.bind.annotation.*;
@RestController
public class GreetingAppController {
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
}
