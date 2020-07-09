package com.xiaofd.graduation.web.controller.Student_Lcm;

import com.xiaofd.graduation.bean.Answer;
import com.xiaofd.graduation.service.IAnswerService;
import com.xiaofd.graduation.util.Message;
import com.xiaofd.graduation.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@Api(description = "答卷")
public class AnswerController {

    @Autowired
    IAnswerService iAnswerService;

    @PostMapping("/答卷管理")
    @ApiOperation(value = "填写答卷")
    public Message inserrAnswer(@RequestBody @Validated Answer answer){
        return MessageUtil.success(iAnswerService.insertAnswer(answer));
    }
}
