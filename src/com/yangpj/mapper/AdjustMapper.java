package com.yangpj.mapper;

import com.yangpj.model.Adjust;

public interface AdjustMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adjust record);

    int insertSelective(Adjust record);

    Adjust selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adjust record);

    int updateByPrimaryKey(Adjust record);
}