package com.yangpj.model;

public class TimeSheet {
    private Integer id;

    private String name;

    private Integer workDays;

    private Integer normalClockin;

    private Integer lateDays;

    private Integer absentDays;

    private Integer earlyDays;

    private Integer leaveNums;

    private Integer makeupNums;

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
}