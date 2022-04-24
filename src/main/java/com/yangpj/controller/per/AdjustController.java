package com.yangpj.controller.per;

import com.yangpj.model.Adjust;
import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.service.AdjustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/4/23 23:54
 */
@RestController
@RequestMapping("/personnel/adjust")
public class AdjustController {
    private final AdjustService adjustService;

    @Autowired
    public AdjustController(AdjustService adjustService) {
        this.adjustService = adjustService;
    }

//    @GetMapping("/")
//    public RespPageBean getByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Adjust adjust, Date[] beginDateScope) {
//        return adjustService.getByPage(page,size,adjust,beginDateScope);
//    }

    @GetMapping("/")
    public RespPageBean findAll() throws IOException {
        return adjustService.findAll();
    }

    @PostMapping("/")
    public RespBean addAdjust(@RequestBody Adjust adjust) {
        if (adjustService.addAdjust(adjust) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (adjustService.deleteById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateById(@RequestBody Adjust adjust) {
        if (adjustService.updateById(adjust) == 1) {
            return RespBean.ok("更新成功！");
        }
        System.out.println("11111111");
        System.out.println(adjust);
        return RespBean.error("更新失败！");
    }
}
