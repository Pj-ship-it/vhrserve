package com.yangpj.mapper;

import com.yangpj.model.Meetingroom;
import org.springframework.stereotype.Repository;

/**
 * MeetingroomDAO继承基类
 */
@Repository
public interface MeetingroomMapper extends MyBatisBaseMapper<Meetingroom, Integer> {
}