package com.yangpj.mapper;

import com.yangpj.model.Sal;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * SalDAO继承基类
 */
@Repository
public interface SalMapper extends MyBatisBaseMapper<Sal, Integer> {
    List<Sal> findAll();
}