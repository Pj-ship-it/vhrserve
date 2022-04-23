package com.yangpj.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Timesheet implements Serializable {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 工作天数
     */
    private Integer workDays;

    /**
     * 正常打卡
     */
    private Integer normalClockin;

    /**
     * 迟到天数
     */
    private Integer lateDays;

    /**
     * 旷工天数
     */
    private Integer absentDays;

    /**
     * 早退天数
     */
    private Integer earlyDays;

    /**
     * 请假次数
     */
    private Integer leaveNums;

    /**
     * 补卡次数
     */
    private Integer makeupNums;

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
        this.name = name;
    }

    public Integer getWorkDays() {
        return workDays;
    }

    public void setWorkDays(Integer workDays) {
        this.workDays = workDays;
    }

    public Integer getNormalClockin() {
        return normalClockin;
    }

    public void setNormalClockin(Integer normalClockin) {
        this.normalClockin = normalClockin;
    }

    public Integer getLateDays() {
        return lateDays;
    }

    public void setLateDays(Integer lateDays) {
        this.lateDays = lateDays;
    }

    public Integer getAbsentDays() {
        return absentDays;
    }

    public void setAbsentDays(Integer absentDays) {
        this.absentDays = absentDays;
    }

    public Integer getEarlyDays() {
        return earlyDays;
    }

    public void setEarlyDays(Integer earlyDays) {
        this.earlyDays = earlyDays;
    }

    public Integer getLeaveNums() {
        return leaveNums;
    }

    public void setLeaveNums(Integer leaveNums) {
        this.leaveNums = leaveNums;
    }

    public Integer getMakeupNums() {
        return makeupNums;
    }

    public void setMakeupNums(Integer makeupNums) {
        this.makeupNums = makeupNums;
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
        Timesheet other = (Timesheet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getWorkDays() == null ? other.getWorkDays() == null : this.getWorkDays().equals(other.getWorkDays()))
            && (this.getNormalClockin() == null ? other.getNormalClockin() == null : this.getNormalClockin().equals(other.getNormalClockin()))
            && (this.getLateDays() == null ? other.getLateDays() == null : this.getLateDays().equals(other.getLateDays()))
            && (this.getAbsentDays() == null ? other.getAbsentDays() == null : this.getAbsentDays().equals(other.getAbsentDays()))
            && (this.getEarlyDays() == null ? other.getEarlyDays() == null : this.getEarlyDays().equals(other.getEarlyDays()))
            && (this.getLeaveNums() == null ? other.getLeaveNums() == null : this.getLeaveNums().equals(other.getLeaveNums()))
            && (this.getMakeupNums() == null ? other.getMakeupNums() == null : this.getMakeupNums().equals(other.getMakeupNums()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getWorkDays() == null) ? 0 : getWorkDays().hashCode());
        result = prime * result + ((getNormalClockin() == null) ? 0 : getNormalClockin().hashCode());
        result = prime * result + ((getLateDays() == null) ? 0 : getLateDays().hashCode());
        result = prime * result + ((getAbsentDays() == null) ? 0 : getAbsentDays().hashCode());
        result = prime * result + ((getEarlyDays() == null) ? 0 : getEarlyDays().hashCode());
        result = prime * result + ((getLeaveNums() == null) ? 0 : getLeaveNums().hashCode());
        result = prime * result + ((getMakeupNums() == null) ? 0 : getMakeupNums().hashCode());
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
        sb.append(", workDays=").append(workDays);
        sb.append(", normalClockin=").append(normalClockin);
        sb.append(", lateDays=").append(lateDays);
        sb.append(", absentDays=").append(absentDays);
        sb.append(", earlyDays=").append(earlyDays);
        sb.append(", leaveNums=").append(leaveNums);
        sb.append(", makeupNums=").append(makeupNums);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}