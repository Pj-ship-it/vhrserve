package com.yangpj.controller.salary;

import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Salary;
import com.yangpj.service.EmployeeService;
import com.yangpj.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author pj
 * @create 2022/1/15 16:02
 */
@RestController
@RequestMapping("/salary/sobcfg")
public class SobConfigController {
    private final EmployeeService employeeService;

    private final SalaryService salaryService;

    @Autowired
    public SobConfigController(EmployeeService employeeService, SalaryService salaryService) {
        this.employeeService = employeeService;
        this.salaryService = salaryService;
    }

    @GetMapping("/")
    public RespPageBean getEmployeeByPageWithSalary(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmployeeByPageWithSalary(page, size);
    }

    @GetMapping("/salaries")
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }

    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(Integer eid, Integer sid) {
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if (result == 1 || result == 2) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
