package com.yangpj.mapper;

import com.yangpj.model.EmployeeTrain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author pj
 */
@Mapper
public interface EmployeeTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeTrain record);

    int insertSelective(EmployeeTrain record);

    EmployeeTrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeTrain record);

    int updateByPrimaryKey(EmployeeTrain record);

    List<EmployeeTrain> getEmpTrainByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("empTrain") EmployeeTrain employeeTrain, @Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("empTrain") EmployeeTrain employeeTrain,@Param("beginDateScope") Date[] beginDateScope);
}