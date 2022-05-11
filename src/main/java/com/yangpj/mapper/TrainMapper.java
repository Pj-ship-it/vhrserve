package com.yangpj.mapper;

import com.yangpj.model.Adjust;
import com.yangpj.model.Train;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TrainDAO继承基类
 */
@Repository
public interface TrainMapper extends com.yangpj.mapper.MyBatisBaseMapper<Train, Integer> {
    List<Train> findAll();
}