package com.yangpj.service;

import com.yangpj.mapper.EmployeeecMapper;
import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.Employeeec;
import com.yangpj.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/1/24 0:00
 */
@Service
public class EmployeeEcService {
    private final EmployeeecMapper employeeecMapper;

    @Autowired
    public EmployeeEcService(EmployeeecMapper employeeecMapper) {
        this.employeeecMapper = employeeecMapper;
    }

    public RespPageBean getEmpEcByPage(Integer page, Integer size, Employeeec employeeec, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Employeeec> data = employeeecMapper.getEmpEcByPage(page, size, employeeec, beginDateScope);
        Long total = employeeecMapper.getTotal(employeeec, beginDateScope);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public Integer addEmployeeEc(Employeeec employeeec) {
        employeeec.setEcDate(new Date());
        return employeeecMapper.insert(employeeec);
    }

    public Integer deleteEmpEcById(Integer id) {
        return employeeecMapper.deleteByPrimaryKey(id);
    }

    public Integer updateEmpEcById(Employeeec employeeec) {
        return employeeecMapper.updateByPrimaryKeySelective(employeeec);
    }
}
