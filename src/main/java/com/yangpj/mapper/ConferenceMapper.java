package com.yangpj.mapper;

import com.yangpj.model.Conference;
import org.springframework.stereotype.Repository;

/**
 * ConferenceDAO继承基类
 */
@Repository
public interface ConferenceMapper extends MyBatisBaseMapper<Conference, Integer> {
}