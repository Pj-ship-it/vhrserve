package com.yangpj.model;

import lombok.Data;

import java.util.Date;

/**
 * @Author pj
 * @create 2022/4/23 17:02
 */
@Data
public class Conference {
    private Integer id;
    private String title;
    private String meetingPlace;
    private String convener;
    private String contact;
    private Date startTime;
    private Date endTime;
    private char status;

}
