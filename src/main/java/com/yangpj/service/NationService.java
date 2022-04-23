package com.yangpj.service;

import com.yangpj.mapper.NationMapper;
import com.yangpj.model.Nation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pj
 * @create 2022/1/13 21:05
 */
@Service
public class NationService {
    private final NationMapper nationMapper;

    @Autowired
    public NationService(NationMapper nationMapper) {
        this.nationMapper = nationMapper;
    }

    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
