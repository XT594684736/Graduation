package com.xiaofd.graduation.bean;

import java.io.Serializable;

public class Answer implements Serializable {
    private Integer id;

    private String answer;

    private Integer studentId;

    private Integer questionnaireNumber;

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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getQuestionnaireNumber() {
        return questionnaireNumber;
    }

    public void setQuestionnaireNumber(Integer questionnaireNumber) {
        this.questionnaireNumber = questionnaireNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", answer=").append(answer);
        sb.append(", studentId=").append(studentId);
        sb.append(", questionnaireNumber=").append(questionnaireNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}