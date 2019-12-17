package com.springcloud.springcloudeurekauser.controller;


import com.springcloud.springcloudeurekauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    public Object findById(Integer id){
        return userService.findById(id);
    }
}
