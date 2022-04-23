package com.yangpj.controller.per;

import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.Employeeec;
import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.service.EmployeeEcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author pj
 * @create 2022/1/23 23:59
 */
@RestController
@RequestMapping("/personnel/ec")
public class PerEcController {
    private final EmployeeEcService employeeEcService;

    @Autowired
    public PerEcController(EmployeeEcService employeeEcService) {
        this.employeeEcService = employeeEcService;
    }

    @GetMapping("/")
    public RespPageBean getEmpEcByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Employeeec employeeec, Date[] beginDateScope) {
        return employeeEcService.getEmpEcByPage(page,size,employeeec,beginDateScope);
    }

    @PostMapping("/")
    public RespBean addEmployeeTrain(@RequestBody Employeeec employeeec) {
        if (employeeEcService.addEmployeeEc(employeeec) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deletePerTrainById(@PathVariable Integer id) {
        if (employeeEcService.deleteEmpEcById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updatePerTrainById(@RequestBody Employeeec employeeec) {
        if (employeeEcService.updateEmpEcById(employeeec) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
