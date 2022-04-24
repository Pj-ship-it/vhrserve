package com.yangpj.mapper;

import com.yangpj.model.Adjust;
import com.yangpj.model.Conference;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ConferenceDAO继承基类
 * @author pj
 */
@Repository
public interface ConferenceMapper extends MyBatisBaseMapper<Conference, Integer> {
    List<Adjust> findAll();
}