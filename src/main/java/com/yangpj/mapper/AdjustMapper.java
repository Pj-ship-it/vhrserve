package com.yangpj.mapper;

import com.yangpj.model.Adjust;
import com.yangpj.model.EmployeeTrain;
import com.yangpj.model.RespPageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * AdjustDAO继承基类
 * @author pj
 */
@Repository
public interface AdjustMapper extends MyBatisBaseMapper<Adjust, Integer> {
    List<Adjust> getByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("adjust") Adjust adjust, @Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("adjust") Adjust adjust,@Param("beginDateScope") Date[] beginDateScope);

    List<Adjust> findAll() throws IOException;
}