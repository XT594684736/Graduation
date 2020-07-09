package com.xiaofd.graduation.bean;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Range;

import java.io.Serializable;


public class Answer implements Serializable {
    @Range(min = 1, max = 2147483647, message = "答案编号范围在1到2147483647之间")
    @ApiModelProperty(value = "答案编号",required = true)
    private Integer id;

    @ApiModelProperty(value = "答案内容")
    private String answer;

    @Range(min = 1, max = 2147483647, message = "评审编号范围在1到2147483647之间")
    @ApiModelProperty(value = "评审编号")
    private Integer assessId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getAssessId() {
        return assessId;
    }

    public void setAssessId(Integer assessId) {
        this.assessId = assessId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", answer=").append(answer);
        sb.append(", assessId=").append(assessId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}