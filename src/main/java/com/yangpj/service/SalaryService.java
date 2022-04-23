package com.yangpj.service;

import com.yangpj.mapper.SalaryMapper;
import com.yangpj.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/1/15 14:59
 */
@Service
public class SalaryService {
    private final SalaryMapper salaryMapper;

    @Autowired
    public SalaryService(SalaryMapper salaryMapper) {
        this.salaryMapper = salaryMapper;
    }

    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }

    public Integer addSalary(Salary salary) {
        salary.setCreateDate(new Date());
        return salaryMapper.insertSelective(salary);
    }

    public Integer deleteSalaryById(Integer id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }


    public Integer updateSalaryById(Salary salary) {
        return salaryMapper.updateByPrimaryKeySelective(salary);
    }
}
