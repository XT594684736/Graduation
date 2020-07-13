package com.xiaofd.graduation.bean;

import java.io.Serializable;

public class Display implements Serializable {
    private Integer id;

    private String column;

    private Integer loginId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column == null ? null : column.trim();
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", column=").append(column);
        sb.append(", loginId=").append(loginId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}