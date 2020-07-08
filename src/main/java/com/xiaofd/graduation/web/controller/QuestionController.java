package com.xiaofd.graduation.web.controller;


import com.xiaofd.graduation.service.IQuestionService;
import com.xiaofd.graduation.util.Message;
import com.xiaofd.graduation.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/question")
@RequestMapping("question")
@Api(description = "毕业设计管理系统 题目模块")
public class QuestionController {
    @Autowired
    private IQuestionService questionService;

    @GetMapping("/deleteById")
    @ApiOperation(value = "通过主键删除一条题目信息")
    public Message deleteById(int id){
        return MessageUtil.success(questionService.deleteById(id));
    }
}
