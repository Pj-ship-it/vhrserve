package com.yangpj.model;

import lombok.Data;

/**
 * @Author pj
 * @create 2022/4/23 17:05
 */
@Data
public class MeetingRoom {
    private Integer id;
    private String name;
    private String place;
    private Integer capacity;
    private String scale;
}
