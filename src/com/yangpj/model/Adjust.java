package com.yangpj.model;

import java.math.BigDecimal;
import java.util.Date;

public class Adjust {
    private Integer id;

    private String name;

    private String idCard;

    private String eid;

    private String changeProperty;

    private String originPost;

    private String newPost;

    private String adjustReason;

    private BigDecimal beforeSalary;

    private BigDecimal afterSalary;

    private Date effectTime;

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String getChangeProperty() {
        return changeProperty;
    }

    public void setChangeProperty(String changeProperty) {
        this.changeProperty = changeProperty == null ? null : changeProperty.trim();
    }

    public String getOriginPost() {
        return originPost;
    }

    public void setOriginPost(String originPost) {
        this.originPost = originPost == null ? null : originPost.trim();
    }

    public String getNewPost() {
        return newPost;
    }

    public void setNewPost(String newPost) {
        this.newPost = newPost == null ? null : newPost.trim();
    }

    public String getAdjustReason() {
        return adjustReason;
    }

    public void setAdjustReason(String adjustReason) {
        this.adjustReason = adjustReason == null ? null : adjustReason.trim();
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

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }
}