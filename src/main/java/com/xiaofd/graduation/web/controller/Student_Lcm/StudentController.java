package com.xiaofd.graduation.web.controller.Student_Lcm;

import com.xiaofd.graduation.bean.Student;
import com.xiaofd.graduation.service.IStudentService;
import com.xiaofd.graduation.util.Message;
import com.xiaofd.graduation.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.MessageUtils;

import java.util.ArrayList;
import java.util.List;

@Validated
@RestController
@Api(description = "学生信息")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @PostMapping("/学生信息管理")
    @ApiOperation(value = "学生信息管理")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value= "学生编号", paramType = "query", dataType = "int", required = true),
//            @ApiImplicitParam(name = "name", value = "学生姓名",  paramType = "query", dataType = "varchar"),
//            @ApiImplicitParam(name = "sex", value = "学生性别",  paramType = "query", dataType = "varchar"),
//            @ApiImplicitParam(name = "major", value = "学生专业",  paramType = "query", dataType = "varchar"),
//            @ApiImplicitParam(name = "clazz", value = "学生班级",  paramType = "query", dataType = "varchar"),
//            @ApiImplicitParam(name = "telephone" ,value = "学生电话",  paramType = "query", dataType = "varchar"),
//            @ApiImplicitParam(name = "email", value = "学生邮箱",  paramType = "query", dataType = "varchar"),
//            @ApiImplicitParam(name = "qq", value = "学生QQ",  paramType = "query", dataType = "varchar")
//    })
    public Message insterStudent(@RequestBody @Validated Student student) {
        return MessageUtil.success(studentService.insertStudent(student));
    }

}
