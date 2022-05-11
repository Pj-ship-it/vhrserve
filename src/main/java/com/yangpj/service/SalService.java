package com.yangpj.service;

import com.yangpj.mapper.SalMapper;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Sal;
import com.yangpj.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pj
 * @create 2022/5/11 22:45
 */
@Service
public class SalService {
    private final SalMapper salMapper;

    @Autowired
    public SalService(SalMapper salMapper) {
        this.salMapper = salMapper;
    }

    public RespPageBean findAll() {
        List<Sal> data = salMapper.findAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        return bean;
    }

    public Integer addTrain(Sal sal) {
        return salMapper.insert(sal);
    }

    public Integer deleteById(Integer id) {
        return salMapper.deleteByPrimaryKey(id);
    }

    public Integer updateById(Sal sal) {
        return salMapper.updateByPrimaryKeySelective(sal);
    }
}
