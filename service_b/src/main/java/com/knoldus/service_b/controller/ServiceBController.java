package com.knoldus.service_b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class ServiceBController {

    @GetMapping
    public String ServiceB(){
        return "Service B called by Service A";
    }





    @GetMapping
    public String serviceB(){
        return "Service B is called from Service A";
    }
}
