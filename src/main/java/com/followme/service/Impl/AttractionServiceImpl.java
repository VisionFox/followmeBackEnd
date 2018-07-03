package com.followme.service.Impl;

import com.followme.common.ServerResponse;
import com.followme.dao.AttractionMapper;
import com.followme.pojo.Attraction;
import com.followme.service.IAttractionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iAttractionService")
public class AttractionServiceImpl implements IAttractionService {
    @Autowired
    private AttractionMapper attractionMapper;

    @Override
    public ServerResponse<List<Attraction>> getAttractionsInfoByArea(String area) {
        if (StringUtils.isBlank(area)) {
            return ServerResponse.createByErrorMessage("区域输入有误");
        }
        List<Attraction> res = attractionMapper.getAttractionsInfoByArea(area);
        return ServerResponse.createBySuccess(res);
    }

    @Override
    public ServerResponse<Attraction> getAttractionsInfoByAattractionId(Long attractionId) {
        if (attractionId == null) {
            return ServerResponse.createByErrorMessage("景点id错误");
        }
        Attraction attraction = attractionMapper.selectByPrimaryKey(attractionId);
        if (attraction == null) {
            return ServerResponse.createByErrorMessage("此景点不存在");
        }
        return ServerResponse.createBySuccess(attraction);
    }
}
