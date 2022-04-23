package com.yangpj.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author pj
 */

@Data
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

}