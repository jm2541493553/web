package com.example.web.controller;

import com.alibaba.fastjson.JSON;
import com.example.web.pojo.User;
import com.example.web.service.UserService;
import com.example.web.vo.JsonResult;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping(value = "AdminLogin")
@EnableAutoConfiguration
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public JsonResult login(String username,String password){
        User user=new User();
        user.setAdmin_name(username);
        user.setAdmin_password(password);
       /* System.out.println(username+password);*/
        User user1=userService.checklogin(user);
        if(user1!=null){
            JsonResult jsonResult=new JsonResult();
            jsonResult.setErrno(101);
            return jsonResult;
        }else {
            JsonResult jsonResult=new JsonResult(null,"用户名或密码错误",102);
            return jsonResult;
        }
    }
}
