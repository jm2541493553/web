package com.example.web.service;

import com.example.web.pojo.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User checklogin(User user);
}
