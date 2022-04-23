package com.yangpj.service;

import com.yangpj.mapper.AdjustMapper;
import com.yangpj.model.Adjust;
import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/4/23 23:29
 */
@Service
public class AdjustService {
    private final AdjustMapper adjustMapper;

    @Autowired
    public AdjustService(AdjustMapper adjustMapper) {
        this.adjustMapper = adjustMapper;
    }

    public RespPageBean getByPage(Integer page, Integer size, Adjust adjust, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Adjust> data = adjustMapper.getByPage(page, size, adjust, beginDateScope);
        Long total = adjustMapper.getTotal(adjust, beginDateScope);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public RespPageBean findAll() throws IOException {
        List<Adjust> data = adjustMapper.findAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        return bean;

    }

    public Integer addAdjust(Adjust adjust) {
        adjust.setEffectTime(new Date());
        return adjustMapper.insert(adjust);
    }

    public Integer deleteById(Integer id) {
        return adjustMapper.deleteByPrimaryKey(id);
    }

    public Integer updateById(Adjust adjust) {
        return adjustMapper.updateByPrimaryKeySelective(adjust);
    }
}
