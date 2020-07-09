package com.xiaofd.graduation.bean;

import java.io.Serializable;
import java.util.Date;

public class Assess implements Serializable {
    private Integer id;

    private Integer score;

    private String opinion;

    private String status;

    private Date assessdate;

    private Integer teacherId;

    private Integer questionnaireId;

    private Integer answerId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getAssessdate() {
        return assessdate;
    }

    public void setAssessdate(Date assessdate) {
        this.assessdate = assessdate;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", score=").append(score);
        sb.append(", opinion=").append(opinion);
        sb.append(", status=").append(status);
        sb.append(", assessdate=").append(assessdate);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", questionnaireId=").append(questionnaireId);
        sb.append(", answerId=").append(answerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}