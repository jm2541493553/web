package com.example.web.mapper;

import com.example.web.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface UserMapper {

    User checklogin(User user);
}
