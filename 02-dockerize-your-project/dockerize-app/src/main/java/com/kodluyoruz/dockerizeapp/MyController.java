package com.kodluyoruz.dockerizeapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public ResponseEntity hello(){
        return ResponseEntity.ok("Hello World");
    }
}
