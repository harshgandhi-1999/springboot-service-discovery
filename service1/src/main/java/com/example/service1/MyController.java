package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String callAnotherService() {
        String serviceResponse = restTemplate.getForObject("http://service2/name", String.class);
        return serviceResponse;
    }
}
