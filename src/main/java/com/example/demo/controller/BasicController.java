package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController 
class BasicController {
    // 프론트엔드 입장
    // GetMapping: 데이터를 얻어옴
    // PostMapping: 데이터를 전송함 

    // this.user_id = user_id;
    // this.password = password;
    // this.name = name; 
    // this.birth_date = birth_date;
    // this.phone_num = phone_num;
    
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/basic") 
    public List<User> basicFunc() {
        userRepository.deleteAllInBatch();
        User user = new User("abc123", "abd456","윤준식", "20050301", "01075857178");
        userRepository.save(user);
        return userRepository.findAll(); 
    } 
}


