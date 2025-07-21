package com.example.service2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/name")
    public ResponseEntity<String> getName(){
        return ResponseEntity.ok("Service 2");
    }
}
