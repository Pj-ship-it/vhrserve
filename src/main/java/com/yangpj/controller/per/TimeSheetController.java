package com.yangpj.controller.per;

import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Timesheet;
import com.yangpj.model.Train;
import com.yangpj.service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Author pj
 * @create 2022/5/11 21:33
 */
@RestController
@RequestMapping("/personnel/timesheet")
public class TimeSheetController {
    private final TimeSheetService timeSheetService;

    @Autowired
    public TimeSheetController(TimeSheetService timeSheetService) {
        this.timeSheetService = timeSheetService;
    }

    @GetMapping("/")
    public RespPageBean findAll() {
        return timeSheetService.findAll();
    }

    @PostMapping("/")
    public RespBean addAdjust(@RequestBody Timesheet timesheet) {
        if (timeSheetService.addTrain(timesheet) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (timeSheetService.deleteById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateById(@RequestBody Timesheet timesheet) {
        if (timeSheetService.updateById(timesheet) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
