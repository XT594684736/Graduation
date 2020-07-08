package com.xiaofd.graduation.service.impl;

import com.xiaofd.graduation.bean.Question;
import com.xiaofd.graduation.mapper.QuestionMapper;
import com.xiaofd.graduation.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public int deleteById(int id) throws RuntimeException {
        return questionMapper.deleteByPrimaryKey(id);
    }
}
