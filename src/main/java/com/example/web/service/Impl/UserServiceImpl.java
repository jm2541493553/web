package com.example.web.service.Impl;

import com.example.web.mapper.UserMapper;
import com.example.web.pojo.User;
import com.example.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User checklogin(User user) {
        User user1=userMapper.checklogin(user);
        if (user1!=null){
            return user1;
        }
        return null;
    }
}
