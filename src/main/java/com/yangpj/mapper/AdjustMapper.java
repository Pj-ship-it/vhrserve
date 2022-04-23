package com.yangpj.mapper;

import com.yangpj.model.Adjust;
import com.yangpj.model.Department;

/**
 * @Author pj
 * @create 2022/4/23 19:05
 */
public interface AdjustMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adjust record);

    int insertSelective(Adjust record);

    Adjust selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adjust record);

    int updateByPrimaryKey(Adjust record);
}
