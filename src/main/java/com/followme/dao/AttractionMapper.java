package com.followme.dao;

import com.followme.pojo.Attraction;

import java.util.List;

public interface AttractionMapper {
    int deleteByPrimaryKey(Long attractionid);

    int insert(Attraction record);

    int insertSelective(Attraction record);

    Attraction selectByPrimaryKey(Long attractionid);

    int updateByPrimaryKeySelective(Attraction record);

    int updateByPrimaryKey(Attraction record);

    List<Attraction> getAttractionsInfoByArea(String area);
}