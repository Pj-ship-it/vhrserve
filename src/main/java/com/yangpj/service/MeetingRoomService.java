package com.yangpj.service;

import com.yangpj.mapper.MeetingroomMapper;
import com.yangpj.model.Meetingroom;
import com.yangpj.model.RespPageBean;
import com.yangpj.model.Sal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pj
 * @create 2022/5/11 23:30
 */
@Service
public class MeetingRoomService {
    private final MeetingroomMapper meetingroomMapper;

    @Autowired
    public MeetingRoomService(MeetingroomMapper meetingroomMapper) {
        this.meetingroomMapper = meetingroomMapper;
    }

    public RespPageBean findAll() {
        List<Meetingroom> data = meetingroomMapper.findAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        return bean;
    }

    public Integer addMeetingRoom(Meetingroom meetingroom) {
        return meetingroomMapper.insert(meetingroom);
    }

    public Integer deleteById(Integer id) {
        return meetingroomMapper.deleteByPrimaryKey(id);
    }

    public Integer updateById(Meetingroom meetingroom) {
        return meetingroomMapper.updateByPrimaryKeySelective(meetingroom);
    }
}
