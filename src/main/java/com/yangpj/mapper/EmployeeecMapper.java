package com.yangpj.mapper;


import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.Employeeec;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author pj
 */
@Mapper
public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);

    List<Employeeec> getEmpEcByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("empEc") Employeeec employeeec, @Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("empEc") Employeeec employeeec, @Param("empEc") Date[] beginDateScope);
}