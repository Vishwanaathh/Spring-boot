package com.example.demo;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public String addUser(User user) {
        if (repository == null) {
            throw new NullPointerException("userRepository is null");
        }
        repository.save(user);
        return "Successfully added!";
    }
    public List<User> getUsers(){
        List<User> a=repository.findAll();
        return a;
    }

    public String deleteUsers(String id){
    
        repository.deleteById(id);
        return "Deleted Succesfully";


    }

}
