package com.yangpj.controller.salary;

import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Sal;
import com.yangpj.model.Train;
import com.yangpj.service.SalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Author pj
 * @create 2022/5/11 22:49
 */
@RestController
@RequestMapping("/salary/table")
public class SalController {
    private final SalService salService;

    @Autowired
    public SalController(SalService salService) {
        this.salService = salService;
    }

    @GetMapping("/")
    public RespPageBean findAll() throws IOException {
        return salService.findAll();
    }

    @PostMapping("/")
    public RespBean addSal(@RequestBody Sal sal) {
        if (salService.addTrain(sal) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (salService.deleteById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateById(@RequestBody Sal sal) {
        if (salService.updateById(sal) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
