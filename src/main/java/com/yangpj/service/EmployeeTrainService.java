package com.yangpj.service;

import com.yangpj.mapper.EmployeeTrainMapper;
import com.yangpj.model.Employee;
import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/1/20 21:47
 */
@Service
public class EmployeeTrainService {
    private final EmployeeTrainMapper employeetrainMapper;

    @Autowired
    public EmployeeTrainService(EmployeeTrainMapper employeetrainMapper) {
        this.employeetrainMapper = employeetrainMapper;
    }

    public RespPageBean getEmpTrainByPage(Integer page, Integer size, EmployeeTrain employeeTrain, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<EmployeeTrain> data = employeetrainMapper.getEmpTrainByPage(page, size, employeeTrain, beginDateScope);
        Long total = employeetrainMapper.getTotal(employeeTrain, beginDateScope);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public Integer addEmployeeTrain(EmployeeTrain employeeTrain) {
        employeeTrain.setTrainDate(new Date());
        return employeetrainMapper.insert(employeeTrain);
    }

    public Integer deletePerTrainById(Integer id) {
        return employeetrainMapper.deleteByPrimaryKey(id);
    }

    public Integer updatePerTrainById(EmployeeTrain employeeTrain) {
        return employeetrainMapper.updateByPrimaryKeySelective(employeeTrain);
    }
}
