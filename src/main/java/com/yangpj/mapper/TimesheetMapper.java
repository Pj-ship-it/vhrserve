package com.yangpj.mapper;


import com.yangpj.model.Timesheet;
import org.springframework.stereotype.Repository;

/**
 * TimesheetDAO继承基类
 */
@Repository
public interface TimesheetMapper extends MyBatisBaseMapper<Timesheet, Integer> {
}