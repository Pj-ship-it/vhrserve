package com.yangpj.mapper;

import com.yangpj.model.Sal;

public interface SalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sal record);

    int insertSelective(Sal record);

    Sal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sal record);

    int updateByPrimaryKey(Sal record);
}