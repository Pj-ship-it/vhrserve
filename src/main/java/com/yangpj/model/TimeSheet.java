package com.yangpj.model;

import lombok.Data;

/**
 * @Author pj
 * @create 2022/4/23 17:09
 */
@Data
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
}
