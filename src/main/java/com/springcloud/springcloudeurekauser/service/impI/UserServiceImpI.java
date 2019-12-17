package com.springcloud.springcloudeurekauser.service.impI;

import com.springcloud.springcloudeurekauser.dao.UserDao;
import com.springcloud.springcloudeurekauser.entity.User;
import com.springcloud.springcloudeurekauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpI implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
}
