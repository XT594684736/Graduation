package com.xiaofd.graduation.bean;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class Student implements Serializable {
    @Range(min = 1, max = 2147483647, message = "编号范围在1到2147483647之间")
    @ApiModelProperty(value = "学生id", required = true)
    private Integer id;

    @ApiModelProperty(value = "学生姓名")
    @Pattern(regexp = "[\\u4E00-\\u9FA5]{2,5}",message = "学生姓名为2至5位")
    private String name;

    @ApiModelProperty(value = "学生性别")
    private String sex;

    @ApiModelProperty(value = "学生专业")
    private String major;

    @ApiModelProperty(value = "学生班级")
    private String clazz;

    @Size(min = 11, max = 11, message = "电话号码为11位")
    @ApiModelProperty(value = "学生联系电话")
    private String telephone;

    @ApiModelProperty(value = "学生邮箱")
    @Email(regexp = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "请输入正确的邮箱格式")
    private String email;

    @ApiModelProperty(value = "学生QQ号")
    @Size(min = 5, max = 11, message = "请输入正确的QQ号")
    private String qq;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz == null ? null : clazz.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", major=").append(major);
        sb.append(", clazz=").append(clazz);
        sb.append(", telephone=").append(telephone);
        sb.append(", email=").append(email);
        sb.append(", qq=").append(qq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}