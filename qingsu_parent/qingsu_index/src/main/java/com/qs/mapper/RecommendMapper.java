package com.qs.mapper;

import com.qs.bean.Recommend;

import java.util.List;


public interface RecommendMapper {
    int deleteByPrimaryKey(Integer recommendId);

    int insert(Recommend record);

    int insertSelective(Recommend record);

    Recommend selectByPrimaryKey(Integer recommendId);

    int updateByPrimaryKeySelective(Recommend record);

    int updateByPrimaryKey(Recommend record);

    List<Recommend> selectByEnableFlag();
}