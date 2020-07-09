package com.xiaofd.graduation.service.impl;

import com.xiaofd.graduation.bean.Student;
import com.xiaofd.graduation.bean.StudentExample;
import com.xiaofd.graduation.mapper.StudentMapper;
import com.xiaofd.graduation.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    /*填写学生信息*/
    @Override
    public int insertStudent(Student student) throws RuntimeException {
        return studentMapper.insert(student);
    }

    @Override
    public List<Student> select(Integer pageNum, Integer pageSize) throws RuntimeException {
        StudentExample studentExample = new StudentExample();
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students.subList(Math.min((pageNum - 1) * pageSize, students.size()), Math.min(pageNum * pageSize - 1, students.size()));
    }
}
