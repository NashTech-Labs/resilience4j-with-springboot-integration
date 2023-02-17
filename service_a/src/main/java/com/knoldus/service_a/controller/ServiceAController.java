package com.knoldus.service_a.controller;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/a")
public class ServiceAController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String Service_A = "ServiceA";
    @GetMapping
    @CircuitBreaker(name = "Service_A")
    public String ServiceA(){

        String BASE_URL = "http://localhost:9091/";
        String url = BASE_URL + "b";
        return restTemplate.getForObject(
                url,String.class
        );
    }


}
