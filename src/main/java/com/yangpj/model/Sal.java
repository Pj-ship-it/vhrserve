package com.yangpj.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Sal implements Serializable {
    private Integer id;

    /**
     * 日期
     */
    private Date date;

    /**
     * 姓名
     */
    private String name;

    /**
     * 基本工资
     */
    private BigDecimal basePay;

    /**
     * 缺勤扣款
     */
    private BigDecimal deduction;

    /**
     * 社保
     */
    private BigDecimal insurance;

    /**
     * 公积金
     */
    private BigDecimal accFund;

    /**
     * 个税
     */
    private BigDecimal perTax;

    /**
     * 实发工资
     */
    private BigDecimal netSalary;

    private static final long serialVersionUID = 1L;

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
        this.name = name;
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
        Sal other = (Sal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBasePay() == null ? other.getBasePay() == null : this.getBasePay().equals(other.getBasePay()))
            && (this.getDeduction() == null ? other.getDeduction() == null : this.getDeduction().equals(other.getDeduction()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getAccFund() == null ? other.getAccFund() == null : this.getAccFund().equals(other.getAccFund()))
            && (this.getPerTax() == null ? other.getPerTax() == null : this.getPerTax().equals(other.getPerTax()))
            && (this.getNetSalary() == null ? other.getNetSalary() == null : this.getNetSalary().equals(other.getNetSalary()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBasePay() == null) ? 0 : getBasePay().hashCode());
        result = prime * result + ((getDeduction() == null) ? 0 : getDeduction().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getAccFund() == null) ? 0 : getAccFund().hashCode());
        result = prime * result + ((getPerTax() == null) ? 0 : getPerTax().hashCode());
        result = prime * result + ((getNetSalary() == null) ? 0 : getNetSalary().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", name=").append(name);
        sb.append(", basePay=").append(basePay);
        sb.append(", deduction=").append(deduction);
        sb.append(", insurance=").append(insurance);
        sb.append(", accFund=").append(accFund);
        sb.append(", perTax=").append(perTax);
        sb.append(", netSalary=").append(netSalary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}