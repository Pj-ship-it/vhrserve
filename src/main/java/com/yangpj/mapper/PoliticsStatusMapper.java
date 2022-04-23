package com.yangpj.mapper;

import com.yangpj.model.PoliticsStatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author pj
 */
@Mapper
public interface PoliticsStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsStatus record);

    int insertSelective(PoliticsStatus record);

    PoliticsStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsStatus record);

    int updateByPrimaryKey(PoliticsStatus record);

    List<PoliticsStatus> getAllPoliticsStatus();
}