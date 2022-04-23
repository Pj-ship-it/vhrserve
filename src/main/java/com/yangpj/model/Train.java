package com.yangpj.model;

import lombok.Data;

import java.util.Date;

/**
 * @Author pj
 * @create 2022/4/23 17:11
 */
@Data
public class Train {
    private Integer id;
    private String name;
    private String participants;
    private String theme;
    private String lecturer;
    private String content;
    private String place;
    private Date shareTime;
}
