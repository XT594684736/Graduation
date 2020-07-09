package com.xiaofd.graduation.service;

import com.xiaofd.graduation.bean.Student;

import java.util.List;

public interface IStudentService {
    /*添加学生信息*/
    int insertStudent(Student student) throws RuntimeException;



    List<Student> select(Integer pageNum,Integer pageSize) throws RuntimeException;
}
