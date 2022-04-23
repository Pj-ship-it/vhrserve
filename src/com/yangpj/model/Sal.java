package com.yangpj.model;

import java.math.BigDecimal;
import java.util.Date;

public class Sal {
    private Integer id;

    private Date date;

    private String name;

    private BigDecimal basePay;

    private BigDecimal deduction;

    private BigDecimal insurance;

    private BigDecimal accFund;

    private BigDecimal perTax;

    private BigDecimal netSalary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getBasePay() {
        return basePay;
    }

    public void setBasePay(BigDecimal basePay) {
        this.basePay = basePay;
    }

    public BigDecimal getDeduction() {
        return deduction;
    }

    public void setDeduction(BigDecimal deduction) {
        this.deduction = deduction;
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public BigDecimal getAccFund() {
        return accFund;
    }

    public void setAccFund(BigDecimal accFund) {
        this.accFund = accFund;
    }

    public BigDecimal getPerTax() {
        return perTax;
    }

    public void setPerTax(BigDecimal perTax) {
        this.perTax = perTax;
    }

    public BigDecimal getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(BigDecimal netSalary) {
        this.netSalary = netSalary;
    }
}