package com.yangpj.controller.per;

import com.yangpj.model.Employee;
import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.service.EmployeeTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/1/20 22:02
 */
@RestController
@RequestMapping("/personnel/train")
public class PerTrainController {
    private final EmployeeTrainService employeeTrainService;

    @Autowired
    public PerTrainController(EmployeeTrainService employeeTrainService) {
        this.employeeTrainService = employeeTrainService;
    }


    @GetMapping("/")
    public RespPageBean getEmpTrainByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, EmployeeTrain employeeTrain, Date[] beginDateScope) {
        return employeeTrainService.getEmpTrainByPage(page,size,employeeTrain,beginDateScope);
    }

    @PostMapping("/")
    public RespBean addEmployeeTrain(@RequestBody EmployeeTrain employeeTrain) {
        if (employeeTrainService.addEmployeeTrain(employeeTrain) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deletePerTrainById(@PathVariable Integer id) {
        if (employeeTrainService.deletePerTrainById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updatePerTrainById(@RequestBody EmployeeTrain employeeTrain) {
        if (employeeTrainService.updatePerTrainById(employeeTrain) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
