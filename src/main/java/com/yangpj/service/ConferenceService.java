package com.yangpj.service;

import com.yangpj.mapper.ConferenceMapper;
import com.yangpj.model.Adjust;
import com.yangpj.model.Conference;
import com.yangpj.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/4/24 20:55
 */
@Service
public class ConferenceService {
    private  final ConferenceMapper conferenceMapper;

    @Autowired
    public ConferenceService(ConferenceMapper conferenceMapper) {
        this.conferenceMapper = conferenceMapper;
    }

    public RespPageBean findAll() throws IOException {
        List<Adjust> data = conferenceMapper.findAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        return bean;

    }

    public Integer addAdjust(Conference conference) {
        return conferenceMapper.insert(conference);
    }

    public Integer deleteById(Integer id) {
        return conferenceMapper.deleteByPrimaryKey(id);
    }

    public Integer updateById(Conference conference) {
        return conferenceMapper.updateByPrimaryKeySelective(conference);
    }
}
