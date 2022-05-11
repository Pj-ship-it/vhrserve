package com.yangpj.mapper;

import com.yangpj.model.Meetingroom;
import com.yangpj.model.Sal;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MeetingroomDAO继承基类
 */
@Repository
public interface MeetingroomMapper extends MyBatisBaseMapper<Meetingroom, Integer> {
    List<Meetingroom> findAll();
}