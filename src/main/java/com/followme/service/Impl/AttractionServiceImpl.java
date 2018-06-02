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
            List<Attraction> res = attractionMapper.getAttractionsInfoByArea("陕西·西安·长安区");
            return ServerResponse.createBySuccess(res);
        }
        List<Attraction> res = attractionMapper.getAttractionsInfoByArea(area);
        return ServerResponse.createBySuccess(res);
    }
}
