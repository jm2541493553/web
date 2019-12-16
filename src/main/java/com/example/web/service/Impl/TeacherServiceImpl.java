package com.example.web.service.Impl;

import com.example.web.mapper.TeacherMapper;
import com.example.web.pojo.Teacher;
import com.example.web.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> getjiaoshou() {
        return teacherMapper.getjiaoshou();
    }

    @Override
    public List<Teacher> getfujiaoshou() {
        return teacherMapper.getfujiaoshou();
    }

    @Override
    public List<Teacher> getjiangshi() {
        return teacherMapper.getjiangshi();
    }
}
