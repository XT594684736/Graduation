package com.xiaofd.graduation.service;

import com.xiaofd.graduation.bean.Answer;

public interface IAnswerService {
    /*填写答案*/
    int insertAnswer (Answer answer) throws RuntimeException;
}
