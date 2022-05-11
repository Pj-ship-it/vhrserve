package com.yangpj.service;

import com.yangpj.mapper.TrainMapper;
import com.yangpj.model.Conference;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pj
 * @create 2022/5/11 19:44
 */
@Service
public class TrainService {
    private final TrainMapper trainMapper;

    @Autowired
    public TrainService(TrainMapper trainMapper) {
        this.trainMapper = trainMapper;
    }

    public RespPageBean findAll() {
        List<Train> data = trainMapper.findAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        return bean;
    }

    public Integer addTrain(Train train) {
        return trainMapper.insert(train);
    }

    public Integer deleteById(Integer id) {
        return trainMapper.deleteByPrimaryKey(id);
    }

    public Integer updateById(Train train) {
        return trainMapper.updateByPrimaryKeySelective(train);
    }
}
