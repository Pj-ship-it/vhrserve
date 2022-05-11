package com.yangpj.controller.per;

import com.yangpj.model.Conference;
import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Train;
import com.yangpj.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Author pj
 * @create 2022/5/11 19:53
 */
@RestController
@RequestMapping("/personnel/train")
public class TrainController {
    private final TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("/")
    public RespPageBean findAll() throws IOException {
        return trainService.findAll();
    }

    @PostMapping("/")
    public RespBean addTrain(@RequestBody Train train) {
        if (trainService.addTrain(train) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (trainService.deleteById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateById(@RequestBody Train train) {
        if (trainService.updateById(train) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
    
}
