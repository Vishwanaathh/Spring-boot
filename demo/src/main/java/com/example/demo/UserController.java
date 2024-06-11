package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/Login")
    public String home(){
        return "index";
    }
    @GetMapping("/Users")
    public ResponseEntity<List<User>>GetUsers(){
        List<User> response=service.getUsers();
        return ResponseEntity.ok(response);
    }
    @PostMapping("/add")
    public ResponseEntity<String>addUser(@RequestBody User user){
        String response=service.addUser(user);
        return ResponseEntity.ok(response);
    }

    
}
