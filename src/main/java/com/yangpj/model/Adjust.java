package com.yangpj.model;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Adjust {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 员工编号
     */
    private String eid;

    /**
     * 异动性质
     */
    private String changeProperty;

    /**
     * 原岗位名称
     */
    private String originPost;

    /**
     * 现岗位名称
     */
    private String newPost;

    /**
     * 调薪原因
     */
    private String adjustReason;

    /**
     * 调前工资
     */
    private BigDecimal beforeSalary;

    /**
     * 调后工资
     */
    private BigDecimal afterSalary;


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
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getChangeProperty() {
        return changeProperty;
    }

    public void setChangeProperty(String changeProperty) {
        this.changeProperty = changeProperty;
    }

    public String getOriginPost() {
        return originPost;
    }

    public void setOriginPost(String originPost) {
        this.originPost = originPost;
    }

    public String getNewPost() {
        return newPost;
    }

    public void setNewPost(String newPost) {
        this.newPost = newPost;
    }

    public String getAdjustReason() {
        return adjustReason;
    }

    public void setAdjustReason(String adjustReason) {
        this.adjustReason = adjustReason;
    }

    public BigDecimal getBeforeSalary() {
        return beforeSalary;
    }

    public void setBeforeSalary(BigDecimal beforeSalary) {
        this.beforeSalary = beforeSalary;
    }

    public BigDecimal getAfterSalary() {
        return afterSalary;
    }

    public void setAfterSalary(BigDecimal afterSalary) {
        this.afterSalary = afterSalary;
    }


    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Adjust other = (Adjust) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getChangeProperty() == null ? other.getChangeProperty() == null : this.getChangeProperty().equals(other.getChangeProperty()))
            && (this.getOriginPost() == null ? other.getOriginPost() == null : this.getOriginPost().equals(other.getOriginPost()))
            && (this.getNewPost() == null ? other.getNewPost() == null : this.getNewPost().equals(other.getNewPost()))
            && (this.getAdjustReason() == null ? other.getAdjustReason() == null : this.getAdjustReason().equals(other.getAdjustReason()))
            && (this.getBeforeSalary() == null ? other.getBeforeSalary() == null : this.getBeforeSalary().equals(other.getBeforeSalary()))
            && (this.getAfterSalary() == null ? other.getAfterSalary() == null : this.getAfterSalary().equals(other.getAfterSalary()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getChangeProperty() == null) ? 0 : getChangeProperty().hashCode());
        result = prime * result + ((getOriginPost() == null) ? 0 : getOriginPost().hashCode());
        result = prime * result + ((getNewPost() == null) ? 0 : getNewPost().hashCode());
        result = prime * result + ((getAdjustReason() == null) ? 0 : getAdjustReason().hashCode());
        result = prime * result + ((getBeforeSalary() == null) ? 0 : getBeforeSalary().hashCode());
        result = prime * result + ((getAfterSalary() == null) ? 0 : getAfterSalary().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", idCard=").append(idCard);
        sb.append(", eid=").append(eid);
        sb.append(", changeProperty=").append(changeProperty);
        sb.append(", originPost=").append(originPost);
        sb.append(", newPost=").append(newPost);
        sb.append(", adjustReason=").append(adjustReason);
        sb.append(", beforeSalary=").append(beforeSalary);
        sb.append(", afterSalary=").append(afterSalary);
        sb.append("]");
        return sb.toString();
    }
}