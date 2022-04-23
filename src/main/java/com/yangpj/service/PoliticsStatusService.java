package com.yangpj.service;

import com.yangpj.mapper.PoliticsStatusMapper;
import com.yangpj.model.PoliticsStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pj
 * @create 2022/1/13 20:59
 */
@Service
public class PoliticsStatusService {
    private final PoliticsStatusMapper politicsStatusMapper;

    @Autowired
    public PoliticsStatusService(PoliticsStatusMapper politicsStatusMapper) {
        this.politicsStatusMapper = politicsStatusMapper;
    }

    public List<PoliticsStatus> getAllPoliticsStatus() {
        return politicsStatusMapper.getAllPoliticsStatus();
    }
}
