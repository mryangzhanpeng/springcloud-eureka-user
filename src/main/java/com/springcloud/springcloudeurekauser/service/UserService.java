package com.springcloud.springcloudeurekauser.service;

import com.springcloud.springcloudeurekauser.entity.User;

public interface UserService {

    User findById(Integer id);
}
