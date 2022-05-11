package com.yangpj.service;

import com.yangpj.mapper.TimesheetMapper;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Timesheet;
import com.yangpj.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pj
 * @create 2022/5/11 21:23
 */
@Service
public class TimeSheetService {
    private final TimesheetMapper timesheetMapper;

    @Autowired
    public TimeSheetService(TimesheetMapper timesheetMapper) {
        this.timesheetMapper = timesheetMapper;
    }

    public RespPageBean findAll() {
        List<Timesheet> data = timesheetMapper.findAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        return bean;
    }

    public Integer addTrain(Timesheet timesheet) {
        return timesheetMapper.insert(timesheet);
    }

    public Integer deleteById(Integer id) {
        return timesheetMapper.deleteByPrimaryKey(id);
    }

    public Integer updateById(Timesheet timesheet) {
        return timesheetMapper.updateByPrimaryKeySelective(timesheet);
    }
}
