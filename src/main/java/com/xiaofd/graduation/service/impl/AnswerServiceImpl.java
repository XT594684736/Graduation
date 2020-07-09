package com.xiaofd.graduation.service.impl;

import com.xiaofd.graduation.bean.Answer;
import com.xiaofd.graduation.mapper.AnswerMapper;
import com.xiaofd.graduation.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements IAnswerService{

    @Autowired
    private AnswerMapper answerMapper;
    @Override
    public int insertAnswer(Answer answer) throws RuntimeException {
        return answerMapper.insert(answer);
    }
}