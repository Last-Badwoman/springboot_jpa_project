package com.yj.springboot_jpa_project.controoler;

import com.yj.springboot_jpa_project.entity.User;
import com.yj.springboot_jpa_project.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContaroller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
       return userRepository.getOne(id);
    }

}
