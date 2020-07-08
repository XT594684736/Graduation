package com.xiaofd.graduation.service.impl;

import com.xiaofd.graduation.bean.Student;
import com.xiaofd.graduation.mapper.StudentMapper;
import com.xiaofd.graduation.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {


    @Override
    public int insert(Student student) throws RuntimeException {
        return 0;
    }
}
