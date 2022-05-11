package com.yangpj.mapper;


import com.yangpj.model.Timesheet;
import com.yangpj.model.Train;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TimesheetDAO继承基类
 */
@Repository
public interface TimesheetMapper extends MyBatisBaseMapper<Timesheet, Integer> {
    List<Timesheet> findAll();
}