package com.yangpj.mapper;

import com.yangpj.model.TimeSheet;

public interface TimeSheetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TimeSheet record);

    int insertSelective(TimeSheet record);

    TimeSheet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TimeSheet record);

    int updateByPrimaryKey(TimeSheet record);
}