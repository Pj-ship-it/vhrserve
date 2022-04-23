package com.yangpj.mapper;

import com.yangpj.model.Train;
import org.springframework.stereotype.Repository;

/**
 * TrainDAO继承基类
 */
@Repository
public interface TrainMapper extends com.yangpj.mapper.MyBatisBaseMapper<Train, Integer> {
}