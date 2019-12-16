package com.example.web.controller;

import com.example.web.pojo.Teacher;
import com.example.web.service.TeacherService;
import com.example.web.service.UserService;
import com.example.web.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "TeacherManage")
@EnableAutoConfiguration
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/getjiaoshou")
    @ResponseBody
    public JsonResult getjiaoshou(){
        List<Teacher> teacherList=teacherService.getjiaoshou();
        return new JsonResult(teacherList);
    }
    @RequestMapping("/getfujiaoshou")
    public JsonResult getfujiaoshou(){
        List<Teacher> teacherList=teacherService.getfujiaoshou();
        return new JsonResult(teacherList);
    }
    @RequestMapping("/getjiangshi")
    public JsonResult getjiangshi(){
        List<Teacher> teacherList=teacherService.getjiangshi();
        return new JsonResult(teacherList);
    }


}
