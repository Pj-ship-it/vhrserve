package com.yangpj.mapper;

import com.yangpj.model.Train;

public interface TrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Train record);

    int insertSelective(Train record);

    Train selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKey(Train record);
}